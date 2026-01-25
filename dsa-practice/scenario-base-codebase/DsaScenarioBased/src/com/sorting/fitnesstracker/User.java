package com.sorting.fitnesstracker;

//class to represent a user
public class User {
	// user attributes
	private String name;
	private int steps;

	// constructor for initializing user
	public User(String name, int steps) {
		this.name = name;
		this.steps = steps;
	}

	// method for get steps
	public int getSteps() {
		return steps;
	}

	// method for displaying user details
	public void display() {
		System.out.println("User: " + name + ", Steps: " + steps);
	}
}
