package com.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

// This class manages roundabout traffic
public class TrafficManager {

	private Vehicle head;
	private Vehicle tail;
	private int capacity;
	private int count;

	private Queue<Vehicle> waitingQueue; // queue for waiting vehicles

	// Constructor to initialize roundabout
	public TrafficManager(int capacity) {
		this.capacity = capacity;
		this.count = 0;
		this.waitingQueue = new LinkedList<>();
		head = tail = null;
	}

	// Vehicle arrives at roundabout
	public void vehicleArrives(Vehicle vehicle) {

		// If space available, add to roundabout
		if (count < capacity) {
			addToRoundabout(vehicle);
		}
		// Otherwise add to waiting queue
		else {
			waitingQueue.offer(vehicle);
			System.out.println("Roundabout full. Vehicle queued: " + vehicle.getVehicleNumber());
		}
	}

	// Add vehicle to circular linked list
	private void addToRoundabout(Vehicle vehicle) {

		if (head == null) {
			// First vehicle case
			head = tail = vehicle;
			tail.setNext(head);
		} else {
			// Insert at end
			tail.setNext(vehicle);
			tail = vehicle;
			tail.setNext(head);
		}

		count++;
		System.out.println("Vehicle entered roundabout: " + vehicle.getVehicleNumber());
	}

	// Vehicle exits from roundabout
	public void vehicleExits() {

		// Underflow condition
		if (head == null) {
			System.out.println("No vehicles in roundabout.");
			return;
		}

		System.out.println("Vehicle exited: " + head.getVehicleNumber());

		// If only one vehicle
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.getNext();
			tail.setNext(head);
		}

		count--;

		// Move waiting vehicle into roundabout
		if (!waitingQueue.isEmpty()) {
			Vehicle nextVehicle = waitingQueue.poll();
			addToRoundabout(nextVehicle);
		}
	}

	// Print current roundabout status
	public void printRoundaboutState() {

		if (head == null) {
			System.out.println("Roundabout is empty.");
			return;
		}

		System.out.println("\nVehicles in Roundabout:");
		Vehicle temp = head;

		// Traverse circular linked list
		do {
			temp.display();
			temp = temp.getNext();
		} while (temp != head);

		System.out.println("Total Vehicles: " + count);
		System.out.println("Waiting Queue Size: " + waitingQueue.size());
	}
}
