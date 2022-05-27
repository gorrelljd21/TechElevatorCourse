package com.techelevator;

public class FruitTree {

    private String typeOfFruit = "";
    private int piecesOfFruitLeft = 0;


    public FruitTree(String typeOfFruit, int piecesOfFruitLeft) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = piecesOfFruitLeft;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public boolean pickFruit(int numberOfPiecesToRemove) {

        if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
            piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
            return true;
        }
        return false;
    }
}


    //If there are enough pieces left on the tree, it "picks" the fruit and updates
    // piecesOfFruitLeft by subtracting numberOfPiecesToRemove from it.

    //The method returns true if there were enough pieces left to pick. It returns
    // false if no fruit was picked—that is, piecesOfFruitLeft was less than numberOfPiecesToRemove


