package com.inheritance.levelone;

//class to represent a Dog extending Animal class
public class Dog extends Animal{

	//Dog class Constructor
	public Dog(String name, int age) {
		super(name, age);
	}

	//overriding makeSound() method from Animal class
	@Override
	public void makeSound() {
		System.out.println(name+" says: Bark Bark");
	}
	
	
}
