package com.constructor.levelone;

//class to store rental details
public class CarRental {
	
	//defining Attributes
	String customerName;
	String carModel;
	int rentalDays;
	
	//parameterized constructor
	public CarRental(String customerName, String carModel, int rentalDays) {
		System.out.println("Parameterized constructor called....");
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}
	
	//program to return total cost
	public double calculateTotalCost() {
		double rentPerDay = 500;
		return rentPerDay*rentalDays;
	}
	
}
