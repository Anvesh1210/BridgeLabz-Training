package com.birdsanctuary;

//class for eagle bird
public class Eagle extends Bird implements Flyable {

	// constructor for eagle
	public Eagle(String name, String id) {
		super(name, "Eagle", id);
	}

	// method for eagle flying
	public void fly() {
		System.out.println(name + " soars high in the sky");
	}
}
