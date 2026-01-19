package com.homenest;

//class for smart camera device
public class Camera extends Device {

	// attributes for Camera
	private boolean recording;

	// constructor for camera
	public Camera(String deviceId, double energyUsage) {
		super(deviceId, energyUsage);
		recording = false;
	}

	// method for turning camera ON
	public void turnOn() {
		setStatus(true);
		recording = true;
		System.out.println("Camera started recording");
	}

	// method for turning camera OFF
	public void turnOff() {
		setStatus(false);
		recording = false;
		System.out.println("Camera stopped");
	}

	// method for resetting camera
	public void reset() {
		System.out.println("Camera storage cleared");
	}

	// method for updating camera firmware
	public void updateFirmware(String version) {
		firmwareLog = "Camera firmware updated to " + version;
	}
}
