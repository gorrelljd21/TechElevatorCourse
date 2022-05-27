package com.techelevator;

import java.util.Scanner;

public class Dec2Bin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter decimal values separated by spaces: "); //ask for val
        String input = scanner.nextLine(); //get val from the user input
        String[] numbersAsArray = input.split(""); // make the user input into an array from a String



        for(String numberAsString : numbersAsArray){ //iterate thru array
            int num = Integer.parseInt(numberAsString); //make string into numbers

            String result = ""; //create var to hold bin val
            while(num > 0){
                int bit = num % 2;
                num /= 2;
                result = bit + result;
            }
            System.out.println(result);
        }
    }
}
