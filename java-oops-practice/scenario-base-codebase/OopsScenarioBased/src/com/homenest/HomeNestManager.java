package com.homenest;

import java.util.*;

//main class for managing devices
public class HomeNestManager {

	// attributes for HomeNestManager
	private List<Device> devices = new ArrayList<>();

	// method for adding device
	public void addDevice(Device d) {
		devices.add(d);
	}

	// method for calculating total energy
	public void totalEnergy(int hours) {
		double total = 0;

		for (Device d : devices) {
			total += d.calculateEnergy(hours);
		}

		System.out.println("Total energy used: " + total + " watts");
	}

	// method for resetting all devices
	public void resetAll() {
		for (Device d : devices) {
			d.reset();
		}
	}

	// method for main execution
	public static void main(String[] args) {

		HomeNestManager manager = new HomeNestManager();

		Device l = new Light("L101", 5, 80);
		Device c = new Camera("C201", 10);
		Device t = new Thermostat("T301", 15, 28);
		Device lock = new Lock("D401", 3);

		manager.addDevice(l);
		manager.addDevice(c);
		manager.addDevice(t);
		manager.addDevice(lock);

		l.turnOn();
		c.turnOn();
		t.turnOn();
		lock.turnOn();

		manager.totalEnergy(5);
		manager.resetAll();
	}
}
