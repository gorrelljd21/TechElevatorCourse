package com.techelevator;

import java.util.List;

public class ListTimes {

    public static void main(String[] args) {

    }

    public boolean foundIntTwice(List<Integer> integerList, int intToFind){
        return integerList.indexOf(intToFind) != integerList.lastIndexOf(intToFind);
    }
}
