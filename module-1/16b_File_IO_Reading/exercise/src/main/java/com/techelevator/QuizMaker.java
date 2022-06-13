package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fully qualified name of the file to read in for quiz questions:");
        String filePath = scanner.nextLine();


        List<QuizQuestion> questions = new ArrayList<>();

        File testFile = new File(filePath);
        try (Scanner fileName = new Scanner(testFile)) {
            while (fileName.hasNextLine()) {
                String line = fileName.nextLine();
                questions.add(new QuizQuestion(line));
            }
        }
        int correctCount = 0;
        for (QuizQuestion question : questions) {
            System.out.printf("%s\n", question.getQuestion());
            for (String availOption : question.getOptions()) {
                System.out.println(availOption);
            }
            System.out.println("What is your answer?" );
            String userAnswer = scanner.nextLine();
            if(userAnswer.equalsIgnoreCase(question.getAnswer())) {
                correctCount = correctCount + 1;

                System.out.println("You are correct");
                System.out.printf("Correct answers %s \n", correctCount);

            } else {
                System.out.println("You are incorrect");
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


// reading question file
// while has next line
// split the string
//List<QuizQuestions>
//collection

// presenting questions to user
//presenting questions
//metrics tracking

//System.out.println("What is your answer?" );
//            String userAnswer = scanner.nextLine();
