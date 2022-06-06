package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ClockTest {

    @Test
    public void when_not_on_vacation_and_weekday_return_7am(){
        //arrange
        Clock clock = new Clock();
        boolean vacation = false;
        int tuesday = 2; //not 0 or 6, anything else would just be a weekday and return false on isWeekend

        //act
        String actual = clock.alarmClock(tuesday, vacation);

        //assert
        Assert.assertEquals("should be 7 am", clock.sevenAM, actual);

    }
    @Test
    public void when_not_vacation_and_saturday_return_10am(){
        Clock clock = new Clock();
        boolean vacation_false = false;
        int saturday = 6;

        //act
        String actual = clock.alarmClock(saturday, vacation_false);

        //assert
        Assert.assertEquals("should be 10 am", "10:00", actual);
    }

    @Test
    public void when_not_vacation_and_sunday_return_10am() {
        Clock clock = new Clock();
        boolean vacation_false = false;
        int sunday = 0;

        //act
        String actual = clock.alarmClock(sunday, vacation_false);

        //assert
        Assert.assertEquals("should be 10 am", "10:00", actual);
    }
    @Test
    public void when_on_vacation_and_weekday_return_10am() {
        //arrange
        Clock clock = new Clock();
        boolean vacation = true;
        int tuesday = 2; //not 0 or 6, anything else would just be a weekday and return false on isWeekend

        //act
        String actual = clock.alarmClock(tuesday, vacation);

        //assert
        Assert.assertEquals("should be 10 am", "10:00", actual);

    }
}
