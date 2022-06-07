package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the fully qualified name of the file that should be searched?");
        String pathName = scan.nextLine();

        File file = new File(pathName);

        System.out.println("What is the search word you are looking for?");
        String searchedWord = scan.nextLine();

        System.out.println("Should the search be case sensitive? (Y\\N)");
        String yesOrNo = scan.nextLine();


        int lineCount = 1;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                if (yesOrNo.equalsIgnoreCase("y")) {
                    String input = scanner.nextLine();
                    if (input.contains(searchedWord)) {
                        System.out.printf("%s: %s\n", lineCount, input);
                    }
                    lineCount++;
                } else if (yesOrNo.equalsIgnoreCase("n")) {
                    String input = scanner.nextLine();
                    String inputLower = input.toLowerCase();
                    if (inputLower.contains(searchedWord.toLowerCase())) {
                        System.out.printf("%s: %s\n", lineCount, input);
                    }
                    lineCount++;
                }
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("This word does not exist.");
        }
    }
}


// for caseSensitiveSearch_LineNumbers and caseSensitiveSearch_LineText
//    int lineCount = 1;
//        try (Scanner scanner = new Scanner(file)) {
//                while (scanner.hasNextLine()) {
//                String input = scanner.nextLine();
//                if (input.contains(searchedWord)) {
//                System.out.printf("%s: %s\n", lineCount, input);
//                }
//                lineCount++;
//                }
//                } catch (FileNotFoundException fnf) {
//                System.out.println("This word does not exist.");
//                }
//                }
//                }