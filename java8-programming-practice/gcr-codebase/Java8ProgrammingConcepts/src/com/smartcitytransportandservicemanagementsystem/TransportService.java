package com.smartcitytransportandservicemanagementsystem;

//transport interface
public interface TransportService {
	String getServiceName();
	String getRoute();
	double getFare();
	String getDepartureTime();

	// Default method for printing details
	default void printServiceDetails() {
		System.out.println("Service: " + getServiceName() + " | Route: " + getRoute() + " | Fare: " + getFare()
				+ " | Departure: " + getDepartureTime());
	}
}
