package com.examproctor;

//main class for execution
public class ExamProctorApp {

	// method for main execution
	public static void main(String[] args) {
		ExamSession session = new ExamSession();
		session.addQuestion(new Question("Q1", "A"));
		session.addQuestion(new Question("Q2", "B"));
		session.addQuestion(new Question("Q3", "C"));
		session.visitQuestion("Q1");
		session.submitAnswer("Q1", "A");
		session.visitQuestion("Q2");
		session.submitAnswer("Q2", "B");
		session.visitQuestion("Q3");
		session.submitAnswer("Q3", "D");

		session.goBack();

		int score = session.calculateScore();

		System.out.println("Final Score: " + score);
	}
}
