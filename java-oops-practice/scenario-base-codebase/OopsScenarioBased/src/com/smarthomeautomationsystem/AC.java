package com.smarthomeautomationsystem;

//class to represent an AC
public class AC extends Appliance {

	//AC constructor with default parameters
    public AC() {
        super("AC", 3.5);
    }

    //overridden method turnOn() to turn on the AC
    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("AC turned ON (Cooling mode)");
    }

  //overridden method turnOff() to turn off the AC
    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("AC turned OFF");
    }
}
