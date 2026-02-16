package com.smartcitytransportandservicemanagementsystem;

//Functional Interface for fare calculation
@FunctionalInterface
public interface FareCalculator {
	//method to calculate fare
	double calculateFare(double distance);
}
