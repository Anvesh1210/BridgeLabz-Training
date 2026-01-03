package com.cabbygoapplication;

import java.util.Scanner;

public class ChubbyGoApp {
	public static void main(String[] args) {

		//creating scanner object
        Scanner sc = new Scanner(System.in);

        //Taking user that which vehicle he/she want to book
        System.out.println("Welcome to CabbyGo");

        System.out.println("Choose Vehicle Type:");
        System.out.println("1. Mini");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");

        int choice = sc.nextInt();

        Vehicle vehicle;

        //creating vehicle object according to the choice of the user
        if (choice == 1) {
            vehicle = new Mini("MP09AB1111");
        } else if (choice == 2) {
            vehicle = new Sedan("MP09AB2222");
        } else if (choice == 3) {
            vehicle = new SUV("MP09AB3333");
        } else {
            System.out.println("Invalid choice. Exiting...");
            sc.close();
            return;
        }

        //creating Driver object
        Driver driver = new Driver("Ramesh", "DLX12345", 4.8);

        //creating ride Service 
        IRideService rideService = new RideService(vehicle, driver);

        //taking distance from the user
        System.out.print("\nEnter distance (in km): ");
        double distance = sc.nextDouble();

        boolean booked = rideService.bookRide(distance);

        //asking user that he/she want to end ride or not
        if (booked) {
            System.out.print("\nDo you want to end the ride? (yes/no): ");
            String end = sc.next();

            if (end.equalsIgnoreCase("yes")) {
                rideService.endRide();
            }
        }

        System.out.println("\nThank you for using CabbyGo");
        sc.close();
    }
}
