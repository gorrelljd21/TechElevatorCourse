package com.techelevator;

import javax.sound.sampled.FloatControl;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		String myString = "Hello world";
		String myString2 = new String("Hello world");
		//both essentially doing the same thing, will never use myString2



		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		System.out.println(myString.length()); //loop for length of string, >>11
		System.out.println(myString.substring(6)); //everything from 6 forward, >>world
		System.out.println(myString.substring(6, 7)); //everything from 6 forward to 7 >>w
		// (6,6) would print nothing
		System.out.println(myString.substring(6, myString.length()-1));

		System.out.println(myString.indexOf("wor")); // >>6, shows where the index searched val begins
		System.out.println(myString.indexOf("xx")); // >> -1, not present
		System.out.println(myString.toLowerCase().indexOf("hello")); //>>should return 0
		System.out.println(myString.toUpperCase();

		System.out.println(myString.charAt(6)); // >>'w', shows which character is being called

		System.out.println(myString.contains("hello")); /* >>false (because H is capitalized), if
														 prompt was h, it would return true */
		System.out.println(myString.startsWith("He")); //>> true, also has .endsWith()

		String myString3 = myString.replace("Hello", "goodbye");
		System.out.println(myString); // >> gives back a new string w modifications
		System.out.println(myString3);/* >> sends out modified string, s=s+"a", its a copy
											with the modification added to it */

		System.out.println(myString.equals(myString2)); //>>true
		System.out.println(myString.equals(myString3)); //>>false
		// .equalsIgnoreCase() returns equal regarless of letter case
		// don't use ==, use .equals/.equalsIgnoreCase

		System.out.println(myString.compareTo(myString2)); /* >> some neg val if val is less, 0 if val same,
															some pos val if val is greater (BD is -1, 0, 1)
															"H" < "He"*/

		//BigDecimal, immutable

		BigDecimal bd = new BigDecimal("4.2"); //def use string
		BigDecimal bd1 = new BigDecimal(1); // can give a double

		System.out.println(bd); // >>4.2

		System.out.println(bd.add(bd1));// >> 5.2, bd is still 4.2. There's .subtract(), all expressions

		//BigDecimal.ONE or TEN or ZERO

		BigDecimal bd2 = BigDecimal.ZERO;
		BigDecimal bd3 = new BigDecimal("0"); //same as above

		BigDecimal bd4 = BigDecimal.valueOf(43); //another way to create BD

		//compare
		System.out.println(bd3.compareTo(bd2)); // >>0

		//localDate, immutable
		LocalDate today = LocalDate.now(); // >>current time
		LocalDate birthday = LocalDate.of(1996, 8, 17);

		System.out.println(today.isAfter(birthday)); //.equals, isBefore, compareTo, returns true/false

		LocalDate tomorrow = LocalDate.now().plusDays(1); //adds one day, can do weeks, months, years
															// can also be = today.plusDays(1);
		LocalDate endOfJan = LocalDate.of(2022, 1, 31);
		endOfJan.plusDays(30); // takes you into march. Use .plusMonths(1) to get February 28th.

		System.out.println(today.format(DateTimeFormatter.ISO_DATE)); //>> 2022-05-23
		System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy MM dd"))); //>> 2022 05 03
		System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy MMM dd"))); //>> 2022 May 03
		System.out.println(today.format(DateTimeFormatter.ofPattern("yyyyMMdd"))); //>> 20220503

		// MM = month, mm = minutes
		// there is LocalTime, not used often



		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
        String hello1 = new String(helloArray);
        String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

	}
}
