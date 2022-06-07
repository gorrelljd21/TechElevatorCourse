package com.techelevator;

import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the fully qualified name of the file to read in for quiz questions:");
		String filePath = scanner.nextLine();

		try(Scanner fileName = new Scanner(filePath)) {
			while(fileName.hasNextLine()) {
				String question = fileName.nextLine();
				QuizQuestion questions = new QuizQuestion(question);
				System.out.println(questions.getQuestion());
			}
		}
	}
}



//        String[] parts = "one |two |three".split( "\\|");
//        for (String part : parts) {
//            System.out.println(part);
// > one
// > two
// > three

// get question
// print question
// print options, add 1-4, subtract 1 for correct index, .compare()
//