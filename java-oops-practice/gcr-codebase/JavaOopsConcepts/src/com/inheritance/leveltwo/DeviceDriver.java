package com.inheritance.leveltwo;

public class DeviceDriver {
	public static void main(String[] args) {
		
		
        Device thermostat = new Thermostat("TH-101", true, 24.5);

        System.out.println("---- Smart Home Device Status ----\n");
        thermostat.displayStatus();
    }
}
