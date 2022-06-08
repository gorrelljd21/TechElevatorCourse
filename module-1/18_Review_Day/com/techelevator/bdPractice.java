package com.techelevator;

import java.math.BigDecimal;

public class bdPractice {
    public static void main(String[] args) {
        // BIGDECIMAL

        //good for money, immutable
        //.valueOf() - given a double youll get back a bigdecimal, but this can give you a slightly off value
        //can use constructor BigDecimal->()<-
        //easier to provide as a string to get exactly what you ask for
        //adding to d does not change it's value, you get back a new value. you can reset d to new value, but original
        // does not change

        //compareTo used to compare BigDecimals, can't use ==,

        BigDecimal d = new BigDecimal("9.08");
        d = d.add(BigDecimal.ONE);
        BigDecimal newD = d.multiply(BigDecimal.TEN);

        int result = newD.compareTo(BigDecimal.ZERO);


//        AccessFun af = new AccessFun();
//        af. //can get to it cause its public

        //interface what obj can do
        //inheritance - "is a", ends in er, what an obj is
        //instance variables, data - "has a"
        //deck has a collection of cards
        //implements - can



    }

}
