package com.birdsanctuary;

//class for penguin bird
public class Penguin extends Bird implements Swimmable {

	// constructor for penguin
	public Penguin(String name, String id) {
		super(name, "Penguin", id);
	}

	// method for penguin swimming
	public void swim() {
		System.out.println(name + " swims swiftly in cold water");
	}
}
