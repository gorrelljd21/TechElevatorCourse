package com.techelevator.guessgame;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Game game = new Game();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Pick a number between 0 amd 100");
            int guess = Integer.parseInt(scanner.nextLine());

            if (guess == game.getSecretNumber()) {
                System.out.println("you are the most awesome guesser!!");
                break;
            } else if (guess < game.getSecretNumber()) {
                System.out.println("no! guess higher");
            } else if (guess > game.getSecretNumber()) {
                System.out.println("no! guess lower");
            }
        }
    }
}


//actor interactor
// orchestration/ workflow
// business rules/state/model

// encapsulation - localizing data