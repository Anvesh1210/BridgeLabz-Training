package com.examproctor;

import java.util.*;

//class managing stack navigation and answers
public class ExamSession {

	// attributes for ExamSession
	private Stack<String> navigationStack;
	private HashMap<String, String> answerMap;
	private HashMap<String, Question> questionBank;

	// constructor for exam session
	public ExamSession() {
		navigationStack = new Stack<>();
		answerMap = new HashMap<>();
		questionBank = new HashMap<>();
	}

	// method for adding question to bank
	public void addQuestion(Question q) {
		questionBank.put(q.getQuestionId(), q);
	}

	// method for navigating to a question
	public void visitQuestion(String qid) {
		navigationStack.push(qid);
		System.out.println("Visited Question: " + qid);
	}

	// method for going back to last visited question
	public void goBack() {
		if (!navigationStack.isEmpty()) {
			navigationStack.pop();
			if (!navigationStack.isEmpty())
				System.out.println("Returned to: " + navigationStack.peek());
		}
	}

	// method for storing answer
	public void submitAnswer(String qid, String answer) {
		answerMap.put(qid, answer);
	}

	// method for evaluating score
	public int calculateScore() {
		int score = 0;

		for (String qid : answerMap.keySet()) {
			String studentAns = answerMap.get(qid);
			String correctAns = questionBank.get(qid).getCorrectAnswer();

			if (studentAns.equalsIgnoreCase(correctAns))
				score++;
		}
		return score;
	}
}
