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

    public int carAge() {
        int currentYear = LocalDateTime.now().getYear();
        int age = currentYear - carYear;

        return age;
    }

    public Boolean needsEcheck(int yearToCheck) {
        boolean doesNeedCheck = false;
        int age = yearToCheck - carYear;
        if (age > 4 && age < 25) {
            if (!isClassicCar) {
                if (carYear % 2 == 0 && yearToCheck % 2 == 0) {
                    doesNeedCheck = true;
                } else if (carYear % 2 == 1 && yearToCheck % 2 == 1) {
                    doesNeedCheck = true;
                }
            }
        }
        return doesNeedCheck;
    }

    @Override
    public String toString() {
        return "CAR - " + this.carYear + " - " + this.carMake;
    }
}
