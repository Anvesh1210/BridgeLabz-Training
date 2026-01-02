package com.inheritance.leveltwo;

public class Thermostat extends Device {

    double temperatureSetting;

    //parameterized constructor
    Thermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    //overridden method : displayStatus()
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting : " + temperatureSetting + " °C");
        System.out.println("Device Type         : Thermostat");
    }
}
