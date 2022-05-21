package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter in a series of decimal values (separated by spaces): ");
        String userNumbers = scanner.nextLine();
        String[] binary = userNumbers.split(" ");

        for (int i = 0; i < binary.length; i++) {

            int givenNumber = Integer.parseInt(binary[i]);
            String numberToBinary = Integer.toBinaryString(givenNumber);
            System.out.printf("%s in binary is %s\n", givenNumber, numberToBinary);
        }
    }
}

//460 8218 1 31313 987654321


