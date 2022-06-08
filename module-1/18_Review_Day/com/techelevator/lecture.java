package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class lecture {
    public static void main(String[] args) throws FileNotFoundException {
        // file FileOutputStream(how to append to a file)

        File f = new File("doesNotExist.txt"); //object representing file

        FileOutputStream fos = new FileOutputStream(f, true); //open in append mode, true means yes you want to append
        // use false if you want to overwrite/ not append, abstraction
        PrintWriter writer = new PrintWriter(f); //used to create and write to file, puts things on the stream, scanner reads
        // off the stream


    }

}
