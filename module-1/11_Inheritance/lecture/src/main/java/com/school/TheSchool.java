package com.school;

import java.util.ArrayList;
import java.util.List;

public class TheSchool {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        //they all derive from Person so you can manipulate them

        Person person = new Person("jessie", 1);
        people.add(person);

        Person student = new Student(2, "Charlie", "freshman");
        people.add(student);

        GradStudent gs = new GradStudent("george", 3);
        Person pGs = gs;
        gs.getStressLevel(); // gets getStressLevel() because it's pulling from GradStudent
        pGs.getName(); //does not get getStressLevel() because it's pulling from Person
        people.add(gs);
    }
}

//    Person person = new Person(jessie, 1);
//    //person.getId
//    Student student = new Student(Charlie, 2, freshman);
//    //student.getId - inheriting id and name from person
//
//    // System.out.println(student.getName()); // >>Charlie
//    // you can override augment behavior of method you inherit from a superclass


