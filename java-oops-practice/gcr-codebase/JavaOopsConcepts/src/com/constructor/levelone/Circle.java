package com.constructor.levelone;

//Circle class to store circle radius
public class Circle {
	
	//defining radius attribute
	double radius;

	//parameterize constructor for Circle class
	public Circle(double radius) {
		System.out.println("Parameterized constructor called....");
		this.radius = radius;
	}

	//default constructor for Circle class
	public Circle() {
		this(1.0);
		System.out.println("Default constructor called....");
	}
	
	//show() method to show circle radius
	public void show() {
		System.out.println("Radius: "+radius);
	}
}
