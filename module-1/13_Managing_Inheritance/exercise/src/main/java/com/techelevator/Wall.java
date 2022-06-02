package com.techelevator;

public abstract class Wall {

    private final String name;
    private final String color;

    public Wall(String name, String color){
        this.name = name;
        this.color = color;
    }
    //  takes no parameters and returns an integer representing the total area of the wall.
    public abstract int getArea();

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
