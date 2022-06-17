package com.techelevator;

import org.junit.Assert;

public class CarTests {
    Car car = new Car(2019, "Subaru", false);

    int result = car.today - car.CarAge(2019); //actual should be 3 years

    Assert.assertEquals("Age is incorrect", 5, result);

    //I don't know why this isn't working. I put the inputs into the car cause there was a red squiggly under the parenthesis

}
