package com.constructor.levelone;

//Person class to store person details
public class Person {
	
	//defining attributes of person class
	String name;
	int age;
	
	//parameterize constructor for Person class
	public Person(String name, int age) {
		System.out.println("Parameterized constructor called....");
		this.name = name;
		this.age = age;
	}
	
	//copy constructor for Person class
	public Person(Person p) {
		System.out.println("copy constructor called....");
		this.name = p.name;
		this.age = p.age;
	}
	
	//show() method to display person class
	public void show() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
