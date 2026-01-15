package com.ambulanceroute;

public class HospitalApp {
	public static void main(String[] args){
		//creating AmbulanceRoute Object
		AmbulanceRoute route = new AmbulanceRoute();
		
		//adding Units to routes
		route.addUnit("Emergency", true);
		route.addUnit("Radiology", false);
		route.addUnit("Surgery", false);
		route.addUnit("ICU", true);

		//calling functions
		route.displayRoute();
		route.findAvailableUnit();
		route.removeUnit("Radiology");
		route.displayRoute();
		route.findAvailableUnit();
	}
}
