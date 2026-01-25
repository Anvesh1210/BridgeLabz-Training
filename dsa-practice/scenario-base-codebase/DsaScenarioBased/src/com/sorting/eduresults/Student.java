package com.sorting.eduresults;

//class to represent a Student
public class Student {
	// Student attributes
	private String name;
	private int score;

	// method for initializing student
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	// method for getting student score
	public int getScore() {
		return score;
	}

	// method for displaying student details
	public void display() {
		System.out.println("Student: " + name + " | Score: " + score);
	}
}
