package com.inheritance.levelone;

//class to represent Truck
public class Truck extends Vehicle {

    double loadCapacity;

    //parameterized constructor
    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    //overridden method : displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity : " + loadCapacity + " tons");
        System.out.println("Vehicle Type  : Truck");
    }
}
