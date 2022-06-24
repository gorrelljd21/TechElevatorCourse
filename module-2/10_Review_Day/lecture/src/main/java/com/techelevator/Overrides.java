package com.techelevator;

public class Overrides {

    int howMuchFun;

    public Overrides(int howMuchFun){
        this.howMuchFun = howMuchFun; //no this, you're setting the parameter to itself, this sets the parameter to the instance var
    }

    //this class extends Objects class
    @Override
    public String toString(){
        return "Fun with overrides and we're having " + howMuchFun + " fun!";
    }

}
