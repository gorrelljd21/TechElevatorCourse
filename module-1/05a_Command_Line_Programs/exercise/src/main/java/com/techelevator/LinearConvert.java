package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the length: ");
        Double inputLength = Double.parseDouble(scanner.nextLine());

        System.out.print("Is the measurement in (m)eter, or (f)eet? ");
        String inputMeasurement = scanner.nextLine();

        if (inputMeasurement.equalsIgnoreCase("F")) {
            Double meter = inputLength * 0.3048;
            System.out.printf("%.2sf is %.2sm.", inputLength, meter);
        }
        if (inputMeasurement.equalsIgnoreCase("M")) {
            Double feet = inputLength * 3.2808399;
            System.out.printf("%.2f C is %.2f F", inputLength, feet);
        }
    }
}

//

