package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter in a series of decimal values (separated by spaces): ");
        String userNumbers = scanner.nextLine();
        String[] binary = userNumbers.split(" ");

        for (int i = 0; i < binary.length; i++) {
            int randomHighNumForUnknownArrayLength = 45;
            if(i == 0) {
                System.out.printf("%s in binary is ", binary[i]);
            } else {
                System.out.printf("\n%s in binary is ", binary[i]);
            }
            int[] numToBinary = new int[randomHighNumForUnknownArrayLength];
            int binaryCounter = 0;
            int binInt = Integer.parseInt(binary[i]);

            while(binInt > 0) {
                numToBinary[binaryCounter++] = binInt % 2;
                binInt = binInt/2; //divide itself by 2 until its to 0
            }
            for(int j = binaryCounter - 1; j >= 0; j--){
                System.out.print(numToBinary[j]);
            }
        }
    }
}



//460 8218 1 31313 987654321

//            int givenNumber = Integer.parseInt(binary[i]);
//            String numberToBinary = Integer.toBinaryString(givenNumber);
//            System.out.printf("%s in binary is %s\n", givenNumber, numberToBinary);

//        if(binInt % 2 == 0){
//                    numToBinary[binaryCounter++] = 0;
//                } else {
//                    numToBinary[binaryCounter++] = 1;
