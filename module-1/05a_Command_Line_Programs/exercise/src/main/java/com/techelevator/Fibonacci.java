package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int userInput = Integer.parseInt(scanner.nextLine());

		int firstFib = 0;
		int secondFib = 1;
		int thirdFib = firstFib + secondFib;
//		System.out.println(firstFib);
//		System.out.println(secondFib);
//		System.out.println(thirdFib);


		while(thirdFib < userInput) {
			firstFib = secondFib;
			secondFib = thirdFib;
			thirdFib = firstFib + secondFib;
			System.out.printf("0, 1, %s ",thirdFib);
		}




	}
}
