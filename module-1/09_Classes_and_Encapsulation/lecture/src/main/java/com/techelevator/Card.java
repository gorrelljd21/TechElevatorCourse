package com.techelevator;

public class Card {

    private final static String[] SUIT_NAMES = new String[] { "Nil", "Spades", "Diamonds", "Clubs", "Hearts" };
    private final static String[] RANK_NAMES = new String[] { "Joker", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King" };

    final static public int ACE = 1; //user can use it but can't change it

    private int suit; //default val is 0
    private int rank = 0; //setting the default, int to encode information (1-4 so that all can get the info)
    // public, anyone who has reference to it can set the vars to whatever they want
    // private, only the behavior/methods are able to access data items, everything else is protected, instill rules
    private boolean faceDown = true;

    // what do you want to do to bring solutions to life

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
        // this(suit, rank, 'showFaceUp:' false); can replace the two this', referencing the other method signature
    }

    public Card(int suit, int rank, boolean showFaceUp) {
        this.suit = suit;
        this.rank = rank;
        this.faceDown = !showFaceUp;

    //=============GETTERS==================//

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public boolean isFaceDown() {
        return faceDown;
    }

    public String toString() {
        return String.format("%s of %s", getSuitName[rank], getRankName[rank]);
        }


        public static String getSuitName(int suit){
            return SUIT_NAMES[suit];
        }

        public static String getRankName(int rank){
            return RANK_NAMES[rank];
        }

    // get allows users to get data items out, conventions for getting it out
    // is, a way to express a boolean
    // "has" is another

    // setters dont give a value = void
  //================SETTERS====================//
    public void setRank(int card) {
        if(rank > 0 && rank <= 13) {
            rank = card;
        }
//    }

//    public void setRank(Card this, int card) {
//        this.rank = card;
//        //this = this instances, rids of ambiguitiy, execution context, spec var that refers to the current instance
//    }

    //method = to be container of behavior of the class

    public void flip() {
        faceDown = !faceDown; //will flip it, not true = false
    }

    //=====================DERIVED PROPERTY======================//
    public String cardOrientation() {
        return "the card is " + ((faceDown) ? "face down" : "face up"); //derived property = combine multiple vals together
    }
    /*constructor = method called when you instantiate a class. has to have same name as class, vals wont change, auto
    * executed when you instantiate the class */

    //instantiate
    //instance
    // final - constant
    // static - this val is not scoped to obj, its scoped to the class


    //=====================METHOD OVERLOAD======================//

    //ability to have multiple methods w same name but different parameters

// use void when you don't need to return anything
        // all methods except constructors need a return type (i.e. void, etc)

    }
}
