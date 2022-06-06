package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

    @Test
    public void when_style_is_three_to_seven_return_maybe() {
        DateFashion dateFashion = new DateFashion();
        int youResult = 3;
        int dateResult = 3;


        int actual = dateFashion.getATable(youResult, dateResult);

        Assert.assertEquals("You might not be fashionable enough", 1, actual);
    }

    @Test
    public void when_style_is_two_or_less_return_no() {
        DateFashion dateFashion = new DateFashion();
        int youResult = 1;
        int dateResult = 1;


        int actual = dateFashion.getATable(youResult, dateResult);

        Assert.assertEquals("You are not fashionable enough", 0, actual);
    }

    @Test
    public void when_style_is_eight_or_more_return_yes() {
        DateFashion dateFashion = new DateFashion();
        int youResult = 9;
        int dateResult = 9;


        int actual = dateFashion.getATable(youResult, dateResult);

        Assert.assertEquals("You are fashionable enough", 2, actual);

    }
}


