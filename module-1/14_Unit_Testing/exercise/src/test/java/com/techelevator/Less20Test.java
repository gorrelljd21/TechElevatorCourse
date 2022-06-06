package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

    @Test
    public void when_n_is_2_less_than_20_multiple_return_true(){
        Less20 less20 = new Less20();
        int twoLess20 = 38;

        boolean actual = less20.isLessThanMultipleOf20(twoLess20);

        Assert.assertTrue("This is a multiple of 20 or is more than 2 less than a multiple of 20", actual);
    }

    @Test
    public void when_n_is_1_less_than_20_multiple_return_true(){
        Less20 less20 = new Less20();
        int twoLess20 = 39;

        boolean actual = less20.isLessThanMultipleOf20(twoLess20);

        Assert.assertTrue("This is a multiple of 20 or is more than 2 less than a multiple of 20", actual);
    }

    @Test
    public void when_n_is_a_multiple_of_20_return_false(){
        Less20 less20 = new Less20();
        int twoLess20 = 40;

        boolean actual = less20.isLessThanMultipleOf20(twoLess20);

        Assert.assertFalse("This is a multiple of 20", actual);
    }

    @Test
    public void when_n_is_less_than_1_or_2_of_20_return_false(){
        Less20 less20 = new Less20();
        int twoLess20 = 37;

        boolean actual = less20.isLessThanMultipleOf20(twoLess20);

        Assert.assertFalse("This is more than 2 less than a multiple of 20", actual);
    }

}
//    //arrange
//    Clock clock = new Clock();
//    boolean vacation = false;
//    int tuesday = 2; //not 0 or 6, anything else would just be a weekday and return false on isWeekend
//
//    //act
//    String actual = clock.alarmClock(tuesday, vacation);
//
////assert
//        Assert.assertEquals("should be 7 am", clock.sevenAM, actual);