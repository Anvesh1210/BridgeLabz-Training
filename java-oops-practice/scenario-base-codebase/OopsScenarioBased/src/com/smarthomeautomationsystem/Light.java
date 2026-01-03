package com.smarthomeautomationsystem;

//class to represent a Light
public class Light extends Appliance {

	//Light constructor with default values
    public Light() {
        super("Light", 0.5);
    }

  //overridden method to turn on Light
    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Light turned ON (Soft illumination)");
    }

  //overridden method to turn off Light
    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Light turned OFF");
    }
}
