package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OurRTNReader {
    public static void main(String[] args) {

        File file = new File("rtn.txt");

        try (Scanner scanner = new Scanner(file)) { //try with resource, this will automatically call .close() method.
            // Knows to close because of an interface derived from Closeable derived from AutoCloseable
            while (scanner.hasNextLine()) { // is there a line to be read true/false
                String input = scanner.nextLine(); // run this if true
                System.out.println(input);
                // if false jump out of loop
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("can't find the file");
        }

    }
}


// java.nio = new input output
// System.out.println(file.getAbsolutePath()); //this will show where program is running
// stack trace to see the path computer took to get to the output

//    File file = new File("rtn.txt");
//    Scanner scanner = null;
//        try{
//                scanner=new Scanner(file); //scanner is opening file
//                while(scanner.hasNextLine()){ // is there a line to be read true/false
//                String input=scanner.nextLine(); // run this if true
//                System.out.println(input);
//                // if false jump out of loop
//                }
//                }catch(FileNotFoundException fnf){
//                System.out.println("can't find the file");
//                }finally{ //ensures scanner always runs
//                scanner.close();
//                }
//                }
//                }


// "one | two"
// .split() to work with each individually
// "one | two | three".split(regex: "\\|"); //regex regular expressions
// ^ matches start of line, ~ matches end of a line
// | significant to regular expressions. we treat it as if it's just another char, need to escape it by doing \\|

//        String[] parts = "one |two |three".split( "\\|");
//        for (String part : parts) {
//            System.out.println(part);
// > one
// > two
// > three

//word search - string search
// "Hello world"
// search for or, it'll be there
//case-sensitive and insensitive search
// insensitive - animalName to herdName, how this is solved is similar to this one