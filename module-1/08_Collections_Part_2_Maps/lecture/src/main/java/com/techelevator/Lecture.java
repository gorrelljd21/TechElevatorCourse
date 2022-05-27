package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("A", 100);
		myMap.put("B", 90);
		myMap.put("C", 80);

		System.out.println("Getting A " + myMap.get("A"));
		System.out.println("Getting Z " + myMap.get("Z"));

		System.out.println("does A exist " + myMap.containsKey("A"));

		myMap.remove("C");
		for (String key : myMap.keySet()) { //returns set w all the keys in it
			System.out.println(key);
		}

		for (Map.Entry<String, Integer> entry : myMap.entrySet()) { //returns set of objects make of key:value
			System.out.printf("Key: %s Value: %s \n", entry.getKey(), entry.getValue());
		}

		System.out.println("=============Overwrite=============\n");
		myMap.put("C", 60);
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
			System.out.printf("Key: %s Value: %s \n", entry.getKey(), entry.getValue());
		}

		System.out.println("==============");
		myMap.put("C", 70);
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
			System.out.printf("Key: %s Value: %s \n", entry.getKey(), entry.getValue());
		}

		System.out.println("==============");
		myMap.put("C", myMap.get("C") + 1);
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
			System.out.printf("Key: %s Value: %s \n", entry.getKey(), entry.getValue());
		}

		System.out.println("==============");
		System.out.println("Number of items: " + myMap.size());
		System.out.println("is empty: " + myMap.isEmpty());

		System.out.println("==============");
		Map<String, Integer> anotherMap = new HashMap<>();
		anotherMap.put("A", 100);
		anotherMap.put("B", 90);
		anotherMap.put("C", 80);

		System.out.println("Are they the same: " + anotherMap.equals(myMap));

		anotherMap.put("D", 60); //new key
		// add key while key is already in there, new val
		// add key while there isn't the key already there, new key:val

		String theKey = "HelLo wOrLd";
		myMap.put(theKey.toLowerCase(), 0); // makes the val all lowercase

		System.out.println("==============");
		String theRequestedKey = "HELLO WORLD";
		System.out.println("does the key exist: " + myMap.containsKey(theRequestedKey));

		System.out.println("==============");
		System.out.println("does the key exist: " + myMap.containsKey(theRequestedKey.toLowerCase()));
	}
}
//		Map<String, List<Integer>> anotherList = new HashMap<>();






//		System.out.println("==========================================");
//
//		Set<Integer> mySet = new HashSet<>();
//		mySet.add(2);
//		mySet.add(3);
//		mySet.add(4);
//		System.out.println(mySet.add(4));
//		System.out.println(mySet.add(5));
//
//		for(Integer value : mySet){
//			System.out.println(value); // >> 2 3 4
//			// 4 twice, but only one. Set enforcing uniqueness
//			/* signature of add will allow you to know if item is in there or not
//			false if its there, true if it isn't when you print it*/
//		}
//
//		mySet.remove(4);
//		mySet.contains(3); //point is to use the return value t/f, since not doing anything w
//							// the return val its highlighted
//		for(Integer value : mySet) {
//			System.out.println(value);
//		}
//
//		Set<Integer> anotherSet = new HashSet<>();
//		anotherSet.add(1);
//		anotherSet.add(2);
//		anotherSet.add(3);
//
//		System.out.println("Are these sets the same? " + mySet.equals(anotherSet)); //>> true
//
//		anotherSet.add(4);
//		System.out.println("Are these sets the same? " + mySet.equals(anotherSet));
//
//		anotherSet.addAll(Arrays.asList(6, 7, 8, 9));
//		for(Integer value : anotherSet) {
//			System.out.println(value);
//		}
//		System.out.println("==================================================================");
//	}

//}
