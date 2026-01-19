package com.homenest;

//class for smart lock device
public class Lock extends Device {

	// attributes for Lock
	private boolean locked;

	// constructor for lock
	public Lock(String deviceId, double energyUsage) {
		super(deviceId, energyUsage);
		locked = true;
	}

	// method for activating lock
	public void turnOn() {
		setStatus(true);
		locked = true;
		System.out.println("Door Locked");
	}

	// method for deactivating lock
	public void turnOff() {
		setStatus(false);
		locked = false;
		System.out.println("Door Unlocked");
	}

	// method for resetting lock
	public void reset() {
		locked = true;
		System.out.println("Lock reset to secure mode");
	}

	// method for updating lock firmware
	public void updateFirmware(String version) {
		firmwareLog = "Lock firmware updated to " + version;
	}
}
