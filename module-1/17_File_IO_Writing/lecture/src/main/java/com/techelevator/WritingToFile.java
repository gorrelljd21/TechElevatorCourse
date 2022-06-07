package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class WritingToFile {
    public static void main(String[] args) {

        //print to file, create file, print current time

        Scanner userInput = new Scanner(System.in);
        System.out.println("what is the name of the file");
        String fileName = userInput.nextLine();

        File file = new File(fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            PrintWriter writer = new PrintWriter(fos);
            writer.printf("it's now %s\n", LocalDateTime.now());
            writer.close();
        }
        catch (FileNotFoundException fnf) {
            System.out.println("why would this happen");
        }
    }
}
