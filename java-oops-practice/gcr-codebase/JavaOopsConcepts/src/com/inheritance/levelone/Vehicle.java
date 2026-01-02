package com.inheritance.levelone;

//class to represent Vehicle
public class Vehicle {
	
	//vehicle Attributes
	int maxSpeed;
	String fuelType;
	 
	//parameterized constructor
	Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
	    this.fuelType = fuelType;
	}

	//method to display details
	void displayInfo() {
	    System.out.println("Max Speed : " + maxSpeed + " km/h");
	    System.out.println("Fuel Type : " + fuelType);
    }
}
