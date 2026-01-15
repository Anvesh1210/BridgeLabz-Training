package com.ambulanceroute;

public class HospitalUnit {
	// Hospital Unit attributes
	String unitName;
	boolean available;
	HospitalUnit next;

	// constructor to Initialize Hospital unit attributes
	public HospitalUnit(String unitName, boolean available) {
		this.unitName = unitName;
		this.available = available;
		this.next = null;
	}
}
