package com.edumentorappliaction;

import java.util.Scanner;

//class to represent quiz
public class Quiz {
	//quiz attributes
	 private String[] questions;      // internal question bank
	    private final String[] answers;  // answers cannot be modified
	    private int score;

	    public Quiz(String[] questions, String[] answers) {
	        this.questions = questions;
	        this.answers = answers;
	        this.score = 0;
	    }

	    public void conductQuiz() {
	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < questions.length; i++) {
	            System.out.println("Q" + (i + 1) + ": " + questions[i]);
	            System.out.print("Your Answer: ");
	            String userAnswer = sc.nextLine();

	            if (answers[i].equalsIgnoreCase(userAnswer)) {
	                score++;
	            }
	        }
	    }

	    public int getScore() {
	        return score;
	    }

	    public double getPercentage() {
	        return (score * 100.0) / answers.length;
	    }
}
