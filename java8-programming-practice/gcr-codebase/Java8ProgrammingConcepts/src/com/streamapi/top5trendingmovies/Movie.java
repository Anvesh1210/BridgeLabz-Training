package com.streamapi.top5trendingmovies;

//class representing a Movie
public class Movie {
	//movie attributes
	private String name;
	private double rating;
	private int releaseYear;

	//constructor for initialize movie
	public Movie(String name, double rating, int releaseYear) {
		this.name = name;
		this.rating = rating;
		this.releaseYear = releaseYear;
	}

	//getter method for movie
	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	//overriding toString() 
	@Override
	public String toString() {
		return "Movie Name= " + name + ", Rating= " + rating + ", Release Year= " + releaseYear;
	}
	
	
}
