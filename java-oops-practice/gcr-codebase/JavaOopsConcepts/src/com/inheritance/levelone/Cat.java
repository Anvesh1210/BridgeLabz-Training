package com.inheritance.levelone;

//class to represent a Cat extending Animal class
public class Cat extends Animal{

	//Cat class Constructor
	public Cat(String name, int age) {
		super(name, age);
	}

	//overriding makeSound() method from Animal class
	@Override
	public void makeSound() {
		System.out.println(name+" says : Meow Meow");
	}
	
	
}
