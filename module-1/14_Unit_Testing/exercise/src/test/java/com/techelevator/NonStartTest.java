package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

    @Test
    public void when_string_is_not_concatenated_return_error(){
        NonStart nonStart = new NonStart();
        String concatOne = "hello";
        String concatTwo = "there";

        String actual = nonStart.getPartialString(concatOne, concatTwo);

        Assert.assertEquals("Strings not concatenated", "ellohere", actual);

    }

    @Test
    public void when_first_string_does_not_omit_first_char_return_error() {
        NonStart nonStart = new NonStart();
        String concatOne = "hello";
        String concatTwo = "there";

        String actual = nonStart.getPartialString(concatOne, concatTwo);

        Assert.assertEquals("first string should omit first char", "ellohere", actual);
    }

    @Test
    public void when_second_string_does_not_omit_first_char_return_error() {
        NonStart nonStart = new NonStart();
        String concatOne = "hello";
        String concatTwo = "there";

        String actual = nonStart.getPartialString(concatOne, concatTwo);

        Assert.assertEquals("second string should omit first char", "ellohere", actual);
    }

    @Test
    public void when_more_than_1_char_is_removed_from_either_string_return_error() {
        NonStart nonStart = new NonStart();
        String concatOne = "hello";
        String concatTwo = "there";

        String actual = nonStart.getPartialString(concatOne, concatTwo);

        Assert.assertEquals("to many char's removed", "ellohere", actual);
    }

}
