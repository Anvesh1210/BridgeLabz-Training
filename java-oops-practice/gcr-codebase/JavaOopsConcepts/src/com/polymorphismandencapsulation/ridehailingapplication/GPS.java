package com.polymorphismandencapsulation.ridehailingapplication;

//interface defining GPS-related operations
public interface GPS {

	//get current location of the vehicle
	String getCurrentLocation();

 	//update vehicle location
 	void updateLocation(String newLocation);
}

