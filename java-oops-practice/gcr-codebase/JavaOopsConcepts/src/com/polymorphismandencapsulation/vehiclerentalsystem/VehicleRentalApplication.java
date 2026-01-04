package com.polymorphismandencapsulation.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalApplication {
    public static void main(String[] args) {

        int rentalDays = 5;

        //polymorphic list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CAR-INS-001"));
        vehicles.add(new Bike("BIKE202", 800, "BIKE-INS-002"));
        vehicles.add(new Truck("TRUCK303", 5000, "TRUCK-INS-003"));

        //printing vehicle details
        for (Vehicle vehicle : vehicles) {

            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = 0;

            System.out.println("Vehicle Type   : " + vehicle.type);
            System.out.println("Vehicle Number : " + vehicle.vehicleNumber);
            System.out.println("Rental Cost    : " + rentalCost);

            // Checking insurance applicability
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                insuranceCost = insurable.calculateInsurance(rentalDays);
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost : " + insuranceCost);
            }

            System.out.println("Total Cost     : " + (rentalCost + insuranceCost));
            System.out.println("--------------------------------------");
        }
    }
}

