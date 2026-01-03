package com.smarthomeautomationsystem;

//Class to represent a Fan
public class Fan extends Appliance {

	//non-parameterized constructor with default values
    public Fan() {
        super("Fan", 1.2);
    }
    
    //overridden method to turn on Fan
    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Fan turned ON (Medium speed)");
    }

    //overridden method to turn off Fan
    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Fan turned OFF");
    }
}
