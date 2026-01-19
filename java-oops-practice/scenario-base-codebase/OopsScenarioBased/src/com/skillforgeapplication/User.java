package com.skillforgeapplication;

public abstract class User {
	protected String name;

	// constructor
	public User(String name) {
		this.name = name;
	}

	// method for getting user name
	public String getName() {
		return name;
	}
}
