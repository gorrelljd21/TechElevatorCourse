package com.techelevator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class QuizQuestion {

    private String question;
    private List<String> options = new ArrayList<>();
    private String answer = "";

    public QuizQuestion(String question){
        String[] questionOptions = question.split("\\|");
        this.question = questionOptions[0];
        for(int i = 1; i < questionOptions.length; i++){
            if(questionOptions[i].contains("*")){
                String noStar = questionOptions[i].replace("*", "");
                this.answer = noStar;
                this.options.add(noStar);
            } else {
                this.options.add(questionOptions[i]);
            }
        }
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getAnswer() {
        return answer;
    }


}

//String[] parts = "one |two |three"

// ?, choice, right answer
