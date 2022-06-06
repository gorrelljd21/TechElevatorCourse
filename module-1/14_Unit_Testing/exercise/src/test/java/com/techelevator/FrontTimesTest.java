package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

    @Test
    public void when_string_is_less_than_2_char_return_2_chars_n_times(){
        FrontTimes frontTimes = new FrontTimes();
        String str = "Ab";
        int n = 3;

        String actual = frontTimes.generateString(str, n);

        Assert.assertEquals("Your str should be 2 char or less", "AbAbAb", actual);
    }

    @Test
    public void when_string_is_3_char_return_3_chars_n_times() {
        FrontTimes frontTimes = new FrontTimes();
        String str = "Abc";
        int n = 3;

        String actual = frontTimes.generateString(str, n);

        Assert.assertEquals("Your str is not repeated enough times", "AbcAbcAbc", actual);
    }
    @Test
    public void when_string_is_more_than_3_char_return_3_chars_n_times() {
        FrontTimes frontTimes = new FrontTimes();
        String str = "Abcd";
        int n = 3;

        String actual = frontTimes.generateString(str, n);

        Assert.assertEquals("Your str should not be more than 3 char", "AbcAbcAbc", actual);
    }
}
