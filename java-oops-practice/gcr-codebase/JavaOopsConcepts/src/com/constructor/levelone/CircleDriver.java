package com.constructor.levelone;

//CircleDriver class to use Circle class
public class CircleDriver {
	public static void main(String[] args) {
		
		//creating two Circle class object 
		Circle firstCircle = new Circle();
		Circle secondCircle = new Circle(25);
		
		//calling show() method for both objects
		firstCircle.show();
		secondCircle.show();
	}
}
