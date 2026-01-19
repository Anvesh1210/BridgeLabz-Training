package com.gamebox;

//base game class
public abstract class Game implements IDownloadable {

	// attributes for Game
	protected String title;
	protected String genre;
	protected double price;
	private double rating;

	// constructor for free game
	public Game(String title, String genre) {
		this.title = title;
		this.genre = genre;
		this.price = 0;
		this.rating = 0;
	}

	// constructor for paid game
	public Game(String title, String genre, double price) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = 0;
	}

	// method for setting rating internally
	protected void setRating(double rating) {
		if (rating >= 0 && rating <= 5) {
			this.rating = rating;
		}
	}

	// method for getting rating
	public double getRating() {
		return rating;
	}

	// method for applying seasonal discount
	public double applyDiscount(double percent) {
		return price - (price * percent / 100);
	}
}
