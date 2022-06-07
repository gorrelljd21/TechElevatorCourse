package com.techelevator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String input = scanner.nextLine();
        //there is no catch in scope outside try this line up
        try {
            int guess = convertTheGuess(input);
            System.out.println(guess);
//        } catch (Exception ex) { don't need this here because NumberFormatException catches Exception, inherits from it.
        } catch (NumberFormatException nfe) {
            System.out.println("cannot convert to a number");
//        } catch (Exception ex) { //put more specific above this, this one will catch whatever nfe doesn't
        } catch (IllegalArgumentException ae) {
            System.out.println("bad math");
            System.out.println(ae.getMessage()); // will pull message from anotherLevelForFun
        }
        finally {
            System.out.println("This will always happen"); //regardless if it needs the catch or not
            scanner.close(); // closes file
        }
    }

    private static int convertTheGuess(String theGuess) throws FileNotFoundException{ // this makes it someone else's problem
        try {
            if(theGuess.isEmpty()) {
                    throw new FileNotFoundException("never mind"); //this is a checked exception
            }
            return anotherLevelForFun(theGuess);
        } catch (ArithmeticException ae) {
            System.out.println("caught ArithmeticException");
            return 0;
        }
    }

    private static int anotherLevelForFun(String guess){
        throw new IllegalArgumentException("bad robot"); // put in throw keyword and then name the instance
//        int theNumber = Integer.parseInt(guess);
//        System.out.println("won't happen for an exception"); //will see for number 7, but not for word seven
//        return theNumber;
    }
}

// be careful about information put in error messages

// catch the exception if you can handle it
// checked exception does not derive from direct exception. you'll be forced to either handle it or make it someone else's problem by compiler
//            if(theGuess.isEmpty()) {
//                    try { // a way to handle it, seen when diff method is advertising a checked exception
//                    throw new FileNotFoundException("never mind"); //this is a checked exception
//                    } catch (FileNotFoundException fnf) {
//                    //something
//                    }