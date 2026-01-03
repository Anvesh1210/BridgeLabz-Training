package com.smarthomeautomationsystem;

//class to represent any Appliance
public abstract class Appliance implements Controllable {
	
	//Appliance attributes
    private boolean powerStatus;
    private double energyUsage; // units per hour
    protected String deviceName;

    //Parameterized constructor to initialize Appliance attributes
    public Appliance(String deviceName, double energyUsage) {
        this.deviceName = deviceName;
        this.energyUsage = energyUsage;
        this.powerStatus = false; //default value
    }

    //setter method to set Power Status
    protected void setPowerStatus(boolean status) {
        this.powerStatus = status;
    }

    //method to check is the appliance on or not
    public boolean isOn() {
        return powerStatus;
    }

    //getter method to get Energy Use
    public double getEnergyUsage() {
        return energyUsage;
    }

    //method to display Appliance Status
    public void displayStatus() {
        System.out.println("----------------------------------");
        System.out.printf("Device        : %s%n", deviceName);
        System.out.printf("Power Status  : %s%n", powerStatus ? "ON" : "OFF");
        System.out.printf("Energy Usage  : %.2f units/hr%n", energyUsage);
        System.out.println("----------------------------------");
    }
}
