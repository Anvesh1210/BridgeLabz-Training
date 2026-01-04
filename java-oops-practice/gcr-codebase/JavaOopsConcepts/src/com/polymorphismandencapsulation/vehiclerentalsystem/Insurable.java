package com.polymorphismandencapsulation.vehiclerentalsystem;

//Interface to define insurance related behavior
public interface Insurable {

	//calculates insurance amount for a vehicle
	double calculateInsurance(int days);

	//returns insurance details
	String getInsuranceDetails();
}

