package com.cabbygoapplication;

public class RideService implements IRideService {

    private Vehicle vehicle;
    private Driver driver;
    private double fare;
    private boolean rideActive;

    private final double baseFare = 50;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
        this.rideActive = false;
    }

    @Override
    public boolean bookRide(double distance) {

        if (distance <= 0) {
            System.out.println("Invalid distance. Ride cannot be booked.");
            return false;
        }

        if (rideActive) {
            System.out.println("Ride already active.");
            return false;
        }

        fare = baseFare + (distance * vehicle.getRatePerKm());
        rideActive = true;

        System.out.println("\nRide Booked Successfully");
        System.out.println("Driver Name   : " + driver.getName());
        System.out.println("Vehicle Type : " + vehicle.getType());
        System.out.println("Vehicle No   : " + vehicle.getVehicleNumber());
        System.out.println("Distance     : " + distance + " km");
        System.out.println("Estimated Fare: ₹" + fare);

        return true;
    }

    @Override
    public boolean endRide() {

        if (!rideActive) {
            System.out.println("No active ride to end.");
            return false;
        }

        rideActive = false;
        System.out.println("\nRide Ended Successfully");
        System.out.println("Total Fare Paid: ₹" + fare);
        return true;
    }
}

