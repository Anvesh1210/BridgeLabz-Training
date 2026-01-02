package com.inheritance.levelone;

//class to represent Car
public class Car extends Vehicle {
    int seatCapacity;

    //parameterized constructor
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    //overridden method : displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity : " + seatCapacity);
        System.out.println("Vehicle Type  : Car");
    }
}

