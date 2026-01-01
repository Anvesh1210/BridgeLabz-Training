package com.inheritance.levelone;

//class to represent a Bird extending Animal class
public class Bird extends Animal{

	//Bird class Constructor
	public Bird(String name, int age) {
		super(name, age);
	}

	//overriding makeSound() method from Animal class
	@Override
	public void makeSound() {
		 System.out.println(name + " says: Chirp Chirp");
	}
	
	
	
}
