package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<Integer> myInts = new ArrayList<>();
		//ArrayList is a class that abides by list concept
		//LinkedList another type of backing
		//compiler determines AL<> by looking at list<>, no need to put Integer in again

		myInts.add(1);
		// autoboxing^, compiler auto converts int to Integer, wrapping automatically
		myInts.add(4);
		myInts.add(3);
		myInts.add(2);

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		myInts.add(4);
		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		myInts.add(1,4);
		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		//will remove first occurrence
		myInts.remove(3);
		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		System.out.println(myInts.contains(4));
		System.out.println(myInts.contains(9));

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int first = myInts.indexOf(4);
		System.out.println(first);
		int last = myInts.lastIndexOf(4); //end of list forward
		System.out.println(last);
		//if first and last position are same, there's only one item in the list

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		Integer[] myArray = myInts.toArray(new Integer[0]);
		//give 0 length array and the type you want created
		for(int index = 0; index < myArray.length; index++){
			System.out.println(myArray[index]);
		}

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(myInts);
		//this mutates the list, changing the sequence of elements in list
		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(myInts);
		for(int index = 0; index < myInts.size(); index++){
			System.out.println(myInts.get(index));
		}

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		//enhanced for loop foreach

		for(Integer anInt: myInts) {
			//iterate through list myInts, at each step put it into var anInt
			System.out.println("next item");
			System.out.println(anInt);
			//works on anything enumerable

		}
		)
	}
}
