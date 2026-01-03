package com.smarthomeautomationsystem;

//class to use Smart Home Automation System
public class SmartHomeAutomation {
	public static void main(String[] args) {

		//creating different types of Appliance object
        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance ac = new AC();

        //creating UserCOntroller object
        UserController controller = new UserController();

        System.out.println("===== SMART HOME CONTROL PANEL =====");

        //turning on devices
        controller.controlDevice(light, true);
        controller.controlDevice(fan, true);
        controller.controlDevice(ac, true);

        //printing status
        light.displayStatus();
        fan.displayStatus();
        ac.displayStatus();

        //comparing two appliance energy
        controller.compareEnergy(ac, fan);

        //turning off devices
        System.out.println("\n===== SHUTTING DOWN DEVICES =====");
        controller.controlDevice(ac, false);
        controller.controlDevice(fan, false);
        controller.controlDevice(light, false);
    }
}
