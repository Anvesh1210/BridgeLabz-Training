package com.skillforgeapplication;

public class Student extends User {
	private int progress;
	private int marks;

	// constructor
	public Student(String name) {
		super(name);
		progress = 0;
		marks = 0;
	}

	// method for updating progress
	public void updateProgress(int completedModules, int totalModules) {
		progress = (completedModules * 100) / totalModules;
	}

	// method for assigning marks
	public void setMarks(int marks) {
		this.marks = marks;
	}

	// method for grading using operators
	public String calculateGrade() {
		if (marks >= 90)
			return "A";
		else if (marks >= 75)
			return "B";
		else if (marks >= 50)
			return "C";
		else
			return "Fail";
	}

	// method for checking completion
	public boolean isCompleted() {
		return progress == 100;
	}
}
