package com.techelevator.reflection;

import java.lang.reflect.Method;

public class RectangleIntrospector {

    public static void main(String[] args) { //shows how to call method on a class without coding the call

        Rectangle rect = new Rectangle();
        rect.setHeight(10);
        rect.setWidth(5);

        Method[] methods = Rectangle.class.getMethods(); //class literal, give back every method on the class
        for (Method method : methods) {
            System.out.format("Method: %s%n", method.getName()); //lists every method

            if (method.getName().equals("getArea")) {
                try {
                    System.out.format("Invoking getArea on rect returns %d%n", method.invoke(rect)); //pass in instance of object you want it to run on
                } catch (Exception e) {
                    System.out.format("Caught unexpected %s. Msg: %s%n", e.getClass().getName(), e.getMessage());
                }
            }
        }
    }
}

//need a default constructor so spring can create an instance