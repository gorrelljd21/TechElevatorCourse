package org.example;

public class extra {
    public static void main(String[] args) {
        String str = "string";

        String firstTwo = str.substring(0,1);
        String lastTwo = str.substring(str.length()-2);
        return firstTwo + lastTwo;



    }
}