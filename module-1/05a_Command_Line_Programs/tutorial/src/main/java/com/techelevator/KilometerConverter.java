package com.techelevator;

import java.util.Scanner;

public class KilometerConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a kilometer value to start with: "); //displays prompt to user
        String value = input.nextLine(); //using scanner to read the vals
        int kilometerStart = Integer.parseInt(value); //converting the string to integer and storing into a var

        System.out.println("Enter a kilometervalue to end at: ");
        value = input.nextLine();
        int kilometerEnd = Integer.parseInt(value);

        System.out.println("Enter how much it should increment by: ");
        value = input.nextLine();
        int kilometerIncrement = Integer.parseInt(value);

        System.out.println("Going from " + kilometerStart + "in km to " + kilometerEnd + " in km, incrementing by " + kilometerIncrement + "km.");

        for(int km = kilometerStart; km <= kilometerEnd; km += kilometerIncrement) {
            double miles = km * 0.621371;
            System.out.println(km + "km is " + miles + "miles.");
        }
    }
    
}
