package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.verification.Times;

import javax.sql.DataSource;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");


    private JdbcTimesheetDao sut;

    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        //arrange - already done

        //act
        Timesheet tsActual = sut.getTimesheet(1);

        //assert
        assertTimesheetsMatch(TIMESHEET_1, tsActual);
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        //arrange - done

        //act
        Timesheet tsActual = sut.getTimesheet(0);

        //assert
        Assert.assertNull("Didn't get null when timesheet_id was not found.", tsActual);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> tsExpected = new ArrayList<>();
        tsExpected.add(TIMESHEET_3);
        tsExpected.add(TIMESHEET_4);

        List<Timesheet> tsActual = sut.getTimesheetsByEmployeeId(2);

        Assert.assertEquals(tsExpected.size(), tsActual.size());
        for(int i = 0; i < tsExpected.size(); i++){
            assertTimesheetsMatch(tsExpected.get(i), tsActual.get(i));
        }
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> expected = new ArrayList<>();
        expected.add(TIMESHEET_1);
        expected.add(TIMESHEET_2);
        expected.add(TIMESHEET_3);

        List<Timesheet> actual = sut.getTimesheetsByProjectId(1);

        Assert.assertEquals(expected.size(), actual.size());

        for(int i = 0; i < expected.size(); i++){
            assertTimesheetsMatch(expected.get(i), actual.get((i)));
        }
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        Timesheet expected = new Timesheet(5, 2, 2, LocalDate.now(), 1.5, false, "Timesheet 5");

        Timesheet actual = sut.createTimesheet(expected);

        assertTimesheetsMatch(expected, actual);

    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet createdTimesheet = sut.createTimesheet(new Timesheet(5, 2, 2, LocalDate.now(), 1.5, false, "Timesheet 5"));

        Assert.assertNotNull("can't test if created project has correct values until createTimesheet is working", createdTimesheet);

        Integer newId = createdTimesheet.getTimesheetId();
        Timesheet retrievedTimesheet = sut.getTimesheet(newId);

        assertTimesheetsMatch(createdTimesheet, retrievedTimesheet);

    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet expected = new Timesheet(1, 2, 2, LocalDate.now(),
                2.5, false, "Timesheet 5");

        sut.updateTimesheet(expected);

        Timesheet actual = sut.getTimesheet(1);

        assertTimesheetsMatch(expected, actual);

    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(1);

        Timesheet actual = sut.getTimesheet(1);
        Assert.assertNull(actual);
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        double expected = 0;
        double actual = sut.getBillableHours(2, 2);
        Assert.assertEquals("Wrong hours", expected, actual, 0.001);
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
