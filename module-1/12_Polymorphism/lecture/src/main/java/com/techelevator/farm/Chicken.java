package com.techelevator.farm;

import java.math.BigDecimal;

public class Chicken extends FarmAnimal implements Sellable {

    public Chicken(){
        super("Chicken", "Cluck");
    }

    public BigDecimal getPrice() {
        return BigDecimal.ONE;
    }
}



//    private String name = "Chicken";
//    private String sound = "Cluck";
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSound() {
//        return sound;
//    }
