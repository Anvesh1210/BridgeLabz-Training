package com.smartcitytransportandservicemanagementsystem;

//class representing Texi Service
public class TaxiService implements TransportService {
	//attributes
	private String route;
	private double fare;
	private String departureTime;

	//constructor to initialize texi service
	public TaxiService(String route, double fare, String departureTime) {
		this.route = route;
		this.fare = fare;
		this.departureTime = departureTime;
	}

	//getter methods
	public String getServiceName() {
		return "Taxi";
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
