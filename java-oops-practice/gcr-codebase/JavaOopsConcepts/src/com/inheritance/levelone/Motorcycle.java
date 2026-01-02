package com.inheritance.levelone;

//class to represent Motorcycle
public class Motorcycle extends Vehicle {

    boolean hasGear;

    //parameterized constructor
    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    //overridden method displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear     : " + hasGear);
        System.out.println("Vehicle Type : Motorcycle");
    }
}

