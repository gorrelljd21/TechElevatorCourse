package com.techelevator;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        int secretNumber = (int)(Math.random() * 100.0);

        Scanner scanner = new Scanner(System.in);

        for(int guessNumber = 0; guessNumber < 3; guessNumber++) { //while(true) to let it run until they're right
            System.out.println("Pick a number between 0-100");
            int guess = Integer.parseInt(scanner.nextLine());

            if(guess == secretNumber){
                System.out.println("You win!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Guess higher dumbass");
            } else if (guess > secretNumber) {
                System.out.println("Guess lower");
            }
        }
    }
}
