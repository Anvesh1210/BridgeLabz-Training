package com.polymorphismandencapsulation.vehiclerentalsystem;

//class to represent a car
public class Car extends Vehicle implements Insurable {
	
	//encapsulated insurance policy number
	private String insurancePolicyNumber;

	public Car(String vehicleNumber, double rentalRate, String policyNumber) {
		super(vehicleNumber, "Car", rentalRate);
		this.insurancePolicyNumber = policyNumber;
	}

	//rental cost = rate * days
	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}

	//insurance = 10% of rental cost
	@Override
	public double calculateInsurance(int days) {
		return calculateRentalCost(days) * 0.10;
	}

	@Override
	public String getInsuranceDetails() {
		return "Car Insurance Policy (Hidden)";
	}
}
