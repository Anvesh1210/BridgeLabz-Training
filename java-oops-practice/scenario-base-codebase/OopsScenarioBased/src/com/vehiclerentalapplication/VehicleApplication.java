package com.vehiclerentalapplication;

//class to use Vehicle rent application
public class VehicleApplication {
	public static void main(String[] args) {

		//creating customer object
        Customer customer = new Customer("Anvesh");

        //creating different types of vehicle objects
        Rentable bike = new Bike("BIKE101");
        Rentable car = new Car("CAR202");
        Rentable truck = new Truck("TRUCK303");

        //renting vehicle to the customer
        customer.rentVehicle(bike, 3);
        System.out.println();
        customer.rentVehicle(car, 7);
        System.out.println();
        customer.rentVehicle(truck, 2);
    }
}
