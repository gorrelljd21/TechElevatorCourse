import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlarmClockTests {

    private AlarmClock clock;

    @Before
    public void setup() {
        this.clock = new AlarmClock();
    }

    private void assertWakeTime(int day, boolean onVaction, String expected) {
        //act
        String result = clock.getWakeTime(day, onVaction);

        //assert
        Assert.assertEquals("Wrong wake up time",expected, result);
    }

    @Test
    public void whenMonday_return0700(){

        assertWakeTime(1, false, "7:00");

    }

    @Test
    public void whenWednesday_return0700(){

        assertWakeTime(3, false, "7:00");

    }

    @Test
    public void whenFriday_return0700(){

        assertWakeTime(5, false, "7:00");

    }

    @Test
    public void whenSaturday_return1000(){

        assertWakeTime(6, false, "10:00");

    }

    @Test
    public void whenSunday_return1000(){

        assertWakeTime(0, false, "10:00");

    }

    @Test
    public void whenMondayVacation_return1000(){

        assertWakeTime(1, true, "10:00");

    }

    @Test
    public void whenSundayVacation_returnOff(){

        assertWakeTime(0, true, "off");

    }

}
