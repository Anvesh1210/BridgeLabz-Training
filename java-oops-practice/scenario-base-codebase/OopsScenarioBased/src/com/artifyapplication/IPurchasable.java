package com.artifyapplication;

//interface used in subclasses
public interface IPurchasable {
	//method to purchase a artwork
	void purchase(User user);
	//method to give license to a Artwork
	void license();
}
