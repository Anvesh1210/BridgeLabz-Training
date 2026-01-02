package com.inheritance.leveltwo;

//class to represent any device
public class Device {

	//device Attributes
    String deviceId;
    boolean status;

    //Parameterized constructor
    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    //method to display details
    void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status    : " + (status ? "ON" : "OFF"));
    }
}
