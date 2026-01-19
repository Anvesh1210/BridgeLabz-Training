package com.examproctor;

//class representing exam question
public class Question {

	// attributes for Question
	private String questionId;
	private String correctAnswer;

	// constructor for question
	public Question(String questionId, String correctAnswer) {
		this.questionId = questionId;
		this.correctAnswer = correctAnswer;
	}

	// method for getting question id
	public String getQuestionId() {
		return questionId;
	}

	// method for getting correct answer
	public String getCorrectAnswer() {
		return correctAnswer;
	}
}
