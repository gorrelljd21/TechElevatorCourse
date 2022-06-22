package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CarTests {

    @Test
    public void whenCarIsOne_returnFalse(){
        //arrange
        Car car = new Car(2021, "Rolls Royce", false);

        //act
        boolean actual = car.needsEcheck(2022);

        //assert
        Assert.assertFalse(actual);
    }

    @Test
    public void whenCarIsThirty_returnFalse(){
        //arrange
        Car car = new Car(1990, "Rolls Royce", false);

        //act
        boolean actual = car.needsEcheck(2022);

        //assert
        Assert.assertFalse(actual);
    }

    @Test
    public void whenCarIsOddAndCurrentYearEven_returnFalse(){
        //arrange
        Car car = new Car(2021, "Rolls Royce", false);

        //act
        boolean actual = car.needsEcheck(2028);

        //assert
        Assert.assertFalse(actual);
    }

    @Test
    public void whenCarIsEvenAndCurrentYearEven_returnTrue(){
        //arrange
        Car car = new Car(2020, "Rolls Royce", false);

        //act
        boolean actual = car.needsEcheck(2028);

        //assert
        Assert.assertTrue(actual);
    }

    @Test
    public void whenCarIsClassic_returnFalse(){
        //arrange
        Car car = new Car(2021, "Rolls Royce", true);

        //act
        boolean actual = car.needsEcheck(2028);

        //assert
        Assert.assertFalse(actual);
    }

}
