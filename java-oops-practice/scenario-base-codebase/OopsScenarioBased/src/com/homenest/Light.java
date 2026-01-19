package com.homenest;

//class for smart light device
public class Light extends Device {

	// attributes for Light
	private int brightness;

	// constructor for light
	public Light(String deviceId, double energyUsage, int brightness) {
		super(deviceId, energyUsage);
		this.brightness = brightness;
	}

	// method for turning light ON
	public void turnOn() {
		setStatus(true);
		System.out.println("Light " + deviceId + " is ON");
	}

	// method for turning light OFF
	public void turnOff() {
		setStatus(false);
		System.out.println("Light " + deviceId + " is OFF");
	}

	// method for resetting brightness
	public void reset() {
		brightness = 50;
		System.out.println("Light reset to default brightness");
	}

	// method for updating light firmware
	public void updateFirmware(String version) {
		firmwareLog = "Light firmware updated to " + version;
	}
}
