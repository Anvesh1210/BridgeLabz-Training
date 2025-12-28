package com.constructor.levelone;

//class to use CarRental class
public class CarRentalDriver {
	public static void main(String[] args) {
		
		//creating car Rental object 
		CarRental car1 = new CarRental("Anvesh", "Ford Mustang", 2);
		//calling totatCost() method
		System.out.println("Total cost: "+car1.calculateTotalCost());
	}
}
