package com.homenest;

//class for smart thermostat
public class Thermostat extends Device {

	// attributes for Thermostat
	private double temperature;

	// constructor for thermostat
	public Thermostat(String deviceId, double energyUsage, double temperature) {
		super(deviceId, energyUsage);
		this.temperature = temperature;
	}

	// method for turning thermostat ON
	public void turnOn() {
		setStatus(true);
		System.out.println("Thermostat running at " + temperature + "°C");
	}

	// method for turning thermostat OFF
	public void turnOff() {
		setStatus(false);
		System.out.println("Thermostat OFF");
	}

	// method for resetting thermostat
	public void reset() {
		temperature = 24.0;
		System.out.println("Thermostat reset to 24°C");
	}

	// method for updating thermostat firmware
	public void updateFirmware(String version) {
		firmwareLog = "Thermostat firmware updated to " + version;
	}
}
