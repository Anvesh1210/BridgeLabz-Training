package com.polymorphismandencapsulation.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RideHailingApplication {
    public static void main(String[] args) {
    		//creating Scanner object
        Scanner sc = new Scanner(System.in);
        List<Vehicle> rides = new ArrayList<>();

        //asking user how many rides he wants to book
        System.out.print("How many rides do you want to book? ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("\nSelect Vehicle Type:");
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Auto");
            int choice = sc.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Wrong input! Please choose 1, 2, or 3.");
                i--;
                continue;
            }

            System.out.print("Enter Vehicle ID: ");
            String id = sc.next();

            System.out.print("Enter Driver Name: ");
            String driver = sc.next();

            System.out.print("Enter Rate per Km: ");
            double rate = sc.nextDouble();

            Vehicle vehicle;

            switch (choice) {
                case 1:
                    vehicle = new Car(id, driver, rate);
                    break;
                case 2:
                    vehicle = new Bike(id, driver, rate);
                    break;
                default:
                    vehicle = new Auto(id, driver, rate);
            }

            System.out.print("Enter Current Location: ");
            String location = sc.next();

            ((GPS) vehicle).updateLocation(location);

            rides.add(vehicle);
        }

        System.out.print("\nEnter Distance (in km): ");
        double distance = sc.nextDouble();

        System.out.println("\n----- Ride Fare Details -----");

        //printing details
        for (Vehicle v : rides) {

            v.getVehicleDetails();
            System.out.println("Current Location : " + ((GPS) v).getCurrentLocation());
            System.out.println("Distance         : " + distance + " km");
            System.out.println("Total Fare       : " + v.calculateFare(distance));
            System.out.println("--------------------------------");
        }

        //closing Scanner object
        sc.close();
    }
}

