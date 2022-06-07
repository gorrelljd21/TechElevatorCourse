package com.techelevator.guessgame;

public class Game {

    public enum Result {
        HIGHER,
        LOWER,
        CORRECT

    }

    private final int secretNumber;

    public Game() {
       secretNumber = (int)(Math.random() * 100.0);
    }

    private int getSecretNumber() {
        return secretNumber;
    }

    public Result evaluateGuess(int guess) {
        if(guess == getSecretNumber()) {
            return Result.CORRECT;
        } else if (guess < getSecretNumber()){
            return Result.HIGHER;
        }
    }

}
