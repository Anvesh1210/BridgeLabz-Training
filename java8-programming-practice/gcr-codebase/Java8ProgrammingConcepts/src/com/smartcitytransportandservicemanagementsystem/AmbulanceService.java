package com.smartcitytransportandservicemanagementsystem;

//class representing ambulance service
public class AmbulanceService implements TransportService, EmergencyService {
	//attributes
	private String route;
	private double fare;
	private String departureTime;

	//constructor to initialize ambulance service
	public AmbulanceService(String route, double fare, String departureTime) {
		this.route = route;
		this.fare = fare;
		this.departureTime = departureTime;
	}

	//getter methods
	public String getServiceName() {
		return "Ambulance";
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
