package com.smartcitytransportandservicemanagementsystem;

//class representing metro service
public class MetroService implements TransportService {
	//attributes
	private String route;
	private double fare;
	private String departureTime;

	//constructor to initialize metro service
	public MetroService(String route, double fare, String departureTime) {
		this.route = route;
		this.fare = fare;
		this.departureTime = departureTime;
	}

	//getter method
	public String getServiceName() {
		return "Metro";
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
