package com.sorting.artexpo;

//class to represent a Artist
public class Artist {
	// class attributes
	private String name;
	private long registrationTime;

	// constructor to initializing artist details
	public Artist(String name, long registrationTime) {
		this.name = name;
		this.registrationTime = registrationTime;
	}

	// method for getting registration time
	public long getRegistrationTime() {
		return registrationTime;
	}

	// method for displaying artist
	public void display() {
		System.out.println("Artist: " + name + " | Time: " + registrationTime);
	}
}
