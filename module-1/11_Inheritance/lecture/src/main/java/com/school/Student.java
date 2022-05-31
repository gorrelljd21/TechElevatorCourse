package com.school;

public class Student extends Person {

    private String year;
    protected int units; //allows it to be accessible from a bunch of subclasses

    public Student(int id, String name, String year){ //initializer
        super(name, id); //call the id of person, does not always need a constructor that matches superclass
        this.year = year;
    }
    @Override
    public String getName(){
        String myName = super.getName();
        return myName + " the " + year;
    }

    public int getUnits(){
        return units;
    }

    public void setUnits(int units){
        this.units = units;
    }

    public int getStressLevel() {
        return units * 2;
    }
}

//    @Override //signal that you're putting on method, communication data to interested party (compiler)
//    //telling compiler you are overriding method from base class
//    // allows you to do something different from superclass, otherwise it'll be flagged
//    my intention is the override method on superclass, prevents you
//    public String getName(){
//        String myName = super.getName(); //need super to prevent infinite loop
//        return myName + " the " + year;
//    }
