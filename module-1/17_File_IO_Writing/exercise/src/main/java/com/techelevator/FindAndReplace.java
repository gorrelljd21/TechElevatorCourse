package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.lang.module.FindException;
import java.nio.file.NoSuchFileException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        //the search word
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the search word?");
        String searchWord = userInput.nextLine();

        //the word to replace the search word with
        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();

        //the source file
        System.out.println("What is the source file?");
        String sourceFile = userInput.nextLine();

        System.out.println("What is the destination file?");
        String destinationFile = userInput.nextLine();

        File original = new File(sourceFile);


            try {
                Scanner sourceFileScan = new Scanner(original);
                PrintWriter writer = new PrintWriter(destinationFile);
                while(sourceFileScan.hasNextLine()) {
                    String line = sourceFileScan.nextLine();
                    writer.println(line.replace(searchWord, replacementWord));
                }
                writer.close();
            } catch (FileNotFoundException fnf){
                    System.out.println("file not found");
                }
            }
        }



//        Scanner userInput = new Scanner(System.in);
//        System.out.println("what is the name of the file");
//        String fileName = userInput.nextLine();
//
//        File file = new File(fileName);
//        try {
//            FileOutputStream fos = new FileOutputStream(file, true);
//            PrintWriter writer = new PrintWriter(fos);
//            writer.printf("it's now %s\n", LocalDateTime.now());
//            writer.close();
//        }
//        catch (FileNotFoundException fnf) {
//            System.out.println("why would this happen");
//        }

//    }
//}





//The program creates a copy of the source file with the requested replacements
// at this location. If the file already exists, it must be overwritten.

//        if (f.exists()) {
//                System.out.println("that folder already exists");
//                } else {
//                if(f.mkdir()) {
//                System.out.println("folder created");
//                System.out.printf("@ %s", f.getAbsolutePath());
//                } else {
//                System.out.println("sorry...could not create the folder");
//                }
//                }

//        try {
//        if(file.exists()){
//        System.out.println("this file already exists");
//        } else {
//        System.out.println("file created");
//        } catch (NoSuchFileException )