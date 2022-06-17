package com.techelevator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Car {

    private int carYear;
    private String carMake;
    private boolean isClassicCar;

    public Car(int carYear, String carMake, boolean isClassicCar) {
        this.carYear = carYear;
        this.carMake = carMake;
        this.isClassicCar = isClassicCar;
    }

    public int CarAge (int age) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        String todayStr = date.format(formatter);
        Integer today = Integer.parseInt(todayStr);
        return today - age;
    }
    // not sure how i could do this here and then call it in main??

    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
    String todayStr = date.format(formatter);
    Integer today = Integer.parseInt(todayStr);
    // i know this is repetitive but I didn't know how to make today work in the int age
    // for the test

    private final int age = today - this.carYear;

    public Boolean needsEcheck(int yearToCheck) {
        if (age < 4) {
            if (age > 25) {
                if (!isClassicCar) {
                    // car needs to be checked
                }
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return "CAR - " + this.carYear + " - " + this.carMake;
    }

}
