package com.homenest;

//abstract base class for smart devices
public abstract class Device implements IControllable {

	// attributes for Device
	protected String deviceId;
	private boolean status;
	protected double energyUsage;
	protected String firmwareLog;

	// constructor for registering device
	public Device(String deviceId, double energyUsage) {
		this.deviceId = deviceId;
		this.energyUsage = energyUsage;
		this.status = false;
		this.firmwareLog = "No updates yet";
	}

	// method for getting device id
	public String getDeviceId() {
		return deviceId;
	}

	// method for checking device status
	public boolean isOn() {
		return status;
	}

	// method for updating status internally
	protected void setStatus(boolean status) {
		this.status = status;
	}

	// method for calculating energy usage
	public double calculateEnergy(int hours) {
		return energyUsage * hours;
	}

	// method for updating firmware
	public abstract void updateFirmware(String version);
}
