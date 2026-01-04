package com.polymorphismandencapsulation.vehiclerentalsystem;

//class to represent a bike
public class Bike extends Vehicle implements Insurable {

	private String insurancePolicyNumber;
	
	public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
		super(vehicleNumber, "Bike", rentalRate);
		this.insurancePolicyNumber = policyNumber;
	}

	//rental cost calculation for bike
	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}

	//insurance = 5% of rental cost
	@Override
	public double calculateInsurance(int days) {
		return calculateRentalCost(days) * 0.05;
	}
	
	@Override
	public String getInsuranceDetails() {
		return "Bike Insurance Policy (Hidden)";
	}
}

