package com.smarthomeautomationsystem;

//UserController class to control device
public class UserController {

	//method to turn on/ off device
    public void controlDevice(Controllable device, boolean powerOn) {
        if (powerOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
    
    //method to compare two appliance energy
    public void compareEnergy(Appliance a1, Appliance a2) {
        System.out.println("\n===== ENERGY COMPARISON =====");
        if (a1.getEnergyUsage() > a2.getEnergyUsage()) {
            System.out.println(a1.deviceName + " consumes more energy than " + a2.deviceName);
        } else if (a1.getEnergyUsage() < a2.getEnergyUsage()) {
            System.out.println(a2.deviceName + " consumes more energy than " + a1.deviceName);
        } else {
            System.out.println("Both devices consume equal energy");
        }
    }
}
