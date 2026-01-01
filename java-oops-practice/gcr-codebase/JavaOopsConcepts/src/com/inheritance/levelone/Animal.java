package com.inheritance.levelone;

//class to represent a Animal
public class Animal {
	//defining Attributes of Animal
	String name;
	int age;
	
	//parameterized constructor
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}


	//makeSound() method to print Animal sound
	public void makeSound() {
		System.out.println("Animal make sound called");
	}
	
	//getter method for Animal
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}
