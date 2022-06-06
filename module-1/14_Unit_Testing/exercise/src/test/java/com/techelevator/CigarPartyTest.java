package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

    @Test
    public void when_party_is_not_successful_and_not_weekend_return_false() {

        CigarParty cigarParty = new CigarParty();
        boolean isWeekend = false;
        int cigars = 38;

        boolean actual = cigarParty.haveParty(cigars, isWeekend);

        Assert.assertFalse("party was successful", actual);

    }

    @Test
    public void when_party_is_not_successful_and_is_weekend_return_false() {

        CigarParty cigarParty = new CigarParty();
        boolean isWeekend = true;
        int cigars = 38;

        boolean actual = cigarParty.haveParty(cigars, isWeekend);

        Assert.assertFalse("party was successful", actual);

    }
}
