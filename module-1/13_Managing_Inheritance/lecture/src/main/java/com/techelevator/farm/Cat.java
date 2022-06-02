package com.techelevator.farm;

public final class Cat extends FarmAnimal implements Singable { //final - telling compiler don't let anyone subclass this object

    public Cat() {
        super("Cat", "Meow");
    }

    @Override
    public String eat() {
        return "cat food";
    }
}

//    @Override
//    public String getName() {
//        return "Cat";
//    }

//    @Override
//    public String getSound() {
//        return "Meow";
//    }

//public class Kitten extends Cat { //can't do
//
//}
