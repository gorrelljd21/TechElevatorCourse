package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzWriter {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the name of the file? ");
        String filePath = userInput.nextLine();

        File file = new File(filePath);

        String fizzBuzz = "";

        for (int number = 1; number <= 300; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                fizzBuzz = "FizzBuzz";
            } else if (number % 5 == 0) {
                fizzBuzz = "Buzz";
            } else if (number % 3 == 0) {
                fizzBuzz = "Fizz";
            } else {
                fizzBuzz = Integer.toString(number);
            }

            try {
                FileOutputStream fos = new FileOutputStream(file, true);
                PrintWriter writer = new PrintWriter(fos);
                writer.println(fizzBuzz);
                writer.close();
            } catch (FileNotFoundException fnf) {
                System.out.println("error");
            }
        }
    }
}


//	public static void main(String[] args) {
//
//            if (number % 3 == 0 && number % 5 == 0) {
//                intToString.add("FizzBuzz");
//            } else if (number % 5 == 0) {
//                intToString.add("Buzz");
//            } else if (number % 3 == 0) {
//                intToString.add("Fizz");
//            } else {
//                intToString.add(Integer.toString(number));
//            }
//        }
//        return intToString;
//    }