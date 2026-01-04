package com.polymorphismandencapsulation.vehiclerentalsystem;

//class to represent a Truck
public class Truck extends Vehicle implements Insurable {

	private String insurancePolicyNumber;

	public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
		super(vehicleNumber, "Truck", rentalRate);
		this.insurancePolicyNumber = policyNumber;
	}

	//truck rental cost includes extra load charge
	@Override
	public double calculateRentalCost(int days) {
		return (getRentalRate() * days) + 1000;
	}

	//insurance = 15% of rental cost
	@Override
	public double calculateInsurance(int days) {
		return calculateRentalCost(days) * 0.15;
	}

	@Override
	public String getInsuranceDetails() {
		return "Truck Insurance Policy (Hidden)";
	}
}
