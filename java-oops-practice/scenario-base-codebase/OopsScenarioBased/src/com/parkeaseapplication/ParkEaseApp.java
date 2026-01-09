package com.parkeaseapplication;

//method to use Park Ease Application
public class ParkEaseApp {
    public static void main(String[] args) {
    	
    	//creating Parking slot objects
        ParkingSlot slot1 = new ParkingSlot("S1", "Car");
        ParkingSlot slot2 = new ParkingSlot("S2", "Bike");

        //creating vehicle object
        Vehicle car = new Car("MP04AB1234");
        Vehicle bike = new Bike("MP04XY5678");

        //assigning bike
        if (slot1.assignVehicle(car)) {
            System.out.println("Car parked successfully.");
            System.out.println(slot1.getBookingLog());
            System.out.println("Parking Charge (6 hrs): ₹" + car.calculateCharges(6));
        }

        System.out.println();

        //assigning 2nd bike
        if (slot2.assignVehicle(bike)) {
            System.out.println("Bike parked successfully.");
            System.out.println(slot2.getBookingLog());
            System.out.println("Parking Charge (7 hrs): ₹" + bike.calculateCharges(7));
        }
    }
}
