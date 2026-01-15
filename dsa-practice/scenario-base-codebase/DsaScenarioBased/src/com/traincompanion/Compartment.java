package com.traincompanion;

public class Compartment {
	private int compartmentNo;
	private String compartmentName;
	private Compartment next;
	private Compartment prev;

	public Compartment(int compartmentNo, String compartmentName) {
		this.compartmentNo = compartmentNo;
		this.compartmentName = compartmentName;
		this.next = null;
		this.prev = null;
	}

	public int getCompartmentNo() {
		return compartmentNo;
	}

	public void setCompartmentNo(int compartmentNo) {
		this.compartmentNo = compartmentNo;
	}

	public String getCompartmentName() {
		return compartmentName;
	}

	public void setCompartmentName(String compartmentName) {
		this.compartmentName = compartmentName;
	}

	public Compartment getNext() {
		return next;
	}

	public void setNext(Compartment next) {
		this.next = next;
	}

	public Compartment getPrev() {
		return prev;
	}

	public void setPrev(Compartment prev) {
		this.prev = prev;
	}
	
	public void displayCompartment() {
		System.out.println("Compartment Number: "+compartmentNo);
		System.out.println("Compartment Name: "+compartmentName);
	}
}
