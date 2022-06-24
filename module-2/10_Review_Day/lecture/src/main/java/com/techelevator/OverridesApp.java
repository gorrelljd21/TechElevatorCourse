package com.techelevator;

public class OverridesApp {
    public static void main(String[] args) {
        //calling from another class to print the method toString
        Overrides foo = new Overrides(5);

        System.out.println(foo.toString());
    }
}
