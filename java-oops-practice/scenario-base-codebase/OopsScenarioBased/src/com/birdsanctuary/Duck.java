package com.birdsanctuary;

//class for duck bird
public class Duck extends Bird implements Flyable, Swimmable {

	// constructor for duck
	public Duck(String name, String id) {
		super(name, "Duck", id);
	}

	// method for duck flying
	public void fly() {
		System.out.println(name + " flies short distances");
	}

	// method for duck swimming
	public void swim() {
		System.out.println(name + " swims in the pond");
	}
}
