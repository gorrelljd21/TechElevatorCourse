package com.techelevator;

import java.util.Scanner;

public class TempConvert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the temperature ");
        Double inputTemp = Double.parseDouble(scanner.nextLine());

        System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
        String inputDeg = scanner.nextLine();

        if (inputDeg.equals("F")) {
            Double temperatureCelsius = ((double) inputTemp - 32) / 1.8;
            System.out.printf("%.2s F is %.2s C.", inputTemp, temperatureCelsius);
        }
        if (inputDeg.equals("C")) {
            Double temperatureFarenheit = (double) inputTemp * 1.8 + 32;
            System.out.printf("%.2f C is %.2f F", inputTemp, temperatureFarenheit);
        }
    }
}

