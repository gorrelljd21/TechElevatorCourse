package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DriverTest {

    @Test
    public void when_has_permit_and_with_licensed_driver_return_true(){
        //arrange
        boolean hasPermit = true;
        boolean withLicensedPassenger = true;
        Driver driver = new Driver();

        //act
        boolean result = driver.canDrive(hasPermit, withLicensedPassenger);

        //assert
        Assert.assertTrue("should be able to drive in this scenario", result);
    }

    @Test
    public void when_has_permit_but_no_passenger_return_false(){
        //arrange
        boolean hasPermit = true;
        boolean withLicensedPassenger = false;
        Driver driver = new Driver();

        //act
        boolean result = driver.canDrive(hasPermit, withLicensedPassenger);

        //assert
        Assert.assertFalse("cannot drive without a licensed passenger", result);
    }

    @Test
    public void when_no_permit_return_false(){
        //arrange
        boolean hasPermit = false;
        boolean withLicensedPassenger = false;
        Driver driver = new Driver();

        //act
        boolean result = driver.canDrive(hasPermit, withLicensedPassenger);

        //assert
        Assert.assertFalse("cannot drive without a permit", result);
    }
}
