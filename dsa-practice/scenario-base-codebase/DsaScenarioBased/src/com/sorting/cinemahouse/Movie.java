package com.sorting.cinemahouse;

public class Movie {
	//Movie attributes
	private String name;
	private int showTime;
	
	//constructor to initialize movie attributes
	public Movie(String name, int showTime) {
		this.name = name;
		this.showTime = showTime;
	}
	
	//getter method for movie
	public String getName() {
		return name;
	}

	public int getShowTime() {
		return showTime;
	}
	
	//overriding toString() method to display object
	public String toString() {
		return "Movie Name :" + name + " Run Time: "+showTime + " min";
	}
}
