package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks = 0;
    private int possibleMarks = 0;
    private String submitterName = "";

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {
        int percentage = (earnedMarks * 100) / possibleMarks;
        if (earnedMarks >= 90) {
            return "A";
        } else if (earnedMarks >= 80) {
            return "B";
        } else if (earnedMarks >= 70) {
            return "C";
        } else if (earnedMarks >= 60) {
            return "D";
        }
        return "F";
    }
}