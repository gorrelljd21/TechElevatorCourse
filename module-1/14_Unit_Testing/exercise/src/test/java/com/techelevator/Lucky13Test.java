package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {

    @Test
    public void when_array_has_3_return_false(){
        Lucky13 lucky13 = new Lucky13();
        int[] babyArray = {2, 3, 5};

        boolean actual = lucky13.getLucky(babyArray);

        Assert.assertFalse("This should be false: 3 detected", actual);

    }

    @Test
    public void when_array_has_1_return_false() {
        Lucky13 lucky13 = new Lucky13();
        int[] babyArray = {2, 1, 5};

        boolean actual = lucky13.getLucky(babyArray);

        Assert.assertFalse("This should be false: 1 detected", actual);
    }

    @Test
    public void when_array_does_not_have_1_or_3_return_true() {
        Lucky13 lucky13 = new Lucky13();
        int[] babyArray = {2, 4, 5};

        boolean actual = lucky13.getLucky(babyArray);

        Assert.assertTrue("This should be true: no 1 or 3 detected", actual);
    }
}
