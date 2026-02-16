package com.smartcitytransportandservicemanagementsystem;

//class representing bus service 
public class BusService implements TransportService {
	//attributes
	private String route;
	private double fare;
	private String departureTime;

	//constructor to initialize bus service
	public BusService(String route, double fare, String departureTime) {
		this.route = route;
		this.fare = fare;
		this.departureTime = departureTime;
	}

	//getter methods
	public String getServiceName() {
		return "Bus";
	}

	public String getRoute() {
		return route;
	}

	public double getFare() {
		return fare;
	}

	public String getDepartureTime() {
		return departureTime;
	}
}
