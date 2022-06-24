package com.techelevator.dao;

import com.techelevator.model.Park;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDaoTests extends BaseDaoTests {

    private static final Park PARK_1 =
            new Park(1, "Park 1", LocalDate.parse("1800-01-02"), 100, true);
    private static final Park PARK_2 =
            new Park(2, "Park 2", LocalDate.parse("1900-12-31"), 200, false);
    private static final Park PARK_3 =
            new Park(3, "Park 3", LocalDate.parse("2000-06-15"), 300, false);

    private JdbcParkDao sut;

    @Before
    public void setup() {
        sut = new JdbcParkDao(dataSource);
    }

    @Test
    public void getPark_returns_correct_park_for_id() {
        //arrange handled via spring black magic

        //act
        Park park1Actual = sut.getPark(1);

        //assert
        //Assert.assertEquals("Park IDs differ.",PARK_1.getParkId(), park1Actual.getParkId());
        assertParksMatch(PARK_1, park1Actual);
    }

    @Test
    public void getPark_returns_null_when_id_not_found() {
        //act
        Park parkActual = sut.getPark(0);

        //assert
        Assert.assertNull("Didn't get null when ID not found", parkActual);
        //assertParksMatch(null, parkActual); can't do this because there isn't a park instance coming back.
        //Throws an NPE
    }

    @Test
    public void getParksByState_returns_all_parks_for_state() {
        //park_state table
        //arrange - set up what I expect to get back, but database set up is done
        List<Park> expected = new ArrayList<>();
        expected.add(PARK_1);
        expected.add(PARK_3);

        //act - call getparksbystate dao, a list of parks
        List<Park> actual = sut.getParksByState("AA");

        //assert
        //Assert.assertEquals("Didn't get expected parks.", expected, actual); //this works because the equals is overridden in Park.java, Park.equals(Object)
        // need long for loop because you need to find the exact location in each expected and actual to know where you are in the list to compare
        Assert.assertEquals("List sizes differ.", expected.size(), actual.size()); //ensure list sizes are equal before looping
        for (int i = 0; i < expected.size(); i++){
            assertParksMatch(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void getParksByState_returns_empty_list_for_abbreviation_not_in_db() {
        Assert.fail();
    }

    @Test
    public void createPark_returns_park_with_id_and_expected_values() {
        //arrange for db done
        //arrange for park
        Park expected = new Park(7, "Park 4", LocalDate.now(), 3.14, true);

        //act
        Park actual = sut.createPark(expected);

        //assert
        Assert.assertEquals("Didn't get expected park_id.", 4, actual.getParkId());
        expected.setParkId(4);
        assertParksMatch(expected, actual); // doesn't pass by itself because
    }

    @Test
    public void created_park_has_expected_values_when_retrieved() {
        Assert.fail();
    }

    @Test
    public void updated_park_has_expected_values_when_retrieved() {
        Assert.fail();
    }

    @Test
    public void deleted_park_cant_be_retrieved() {
        Assert.fail();
    }

    @Test
    public void park_added_to_state_is_in_list_of_parks_by_state() {
        Assert.fail();
    }

    @Test
    public void park_removed_from_state_is_not_in_list_of_parks_by_state() {
        Assert.fail();
    }

    private void assertParksMatch(Park expected, Park actual) {
        Assert.assertEquals("Park IDs differ.", expected.getParkId(), actual.getParkId());
        Assert.assertEquals("Park names differ.", expected.getParkName(), actual.getParkName());
        Assert.assertEquals("Dates established differ.", expected.getDateEstablished(), actual.getDateEstablished());
        Assert.assertEquals("Areas differ.", expected.getArea(), actual.getArea(), 0.1);
        Assert.assertEquals("Has camping differs.",expected.getHasCamping(), actual.getHasCamping());
    }

}
