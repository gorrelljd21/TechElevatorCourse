package com.techelevator;

public class RectangleWall extends Wall {

    protected int length;
    protected int height;

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;

    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String toString(){
       return getName() + " " + "(" + length + "x" + height + ")" + " rectangle";
    }

    @Override
    public int getArea() {
        return length * height;
    }
}
