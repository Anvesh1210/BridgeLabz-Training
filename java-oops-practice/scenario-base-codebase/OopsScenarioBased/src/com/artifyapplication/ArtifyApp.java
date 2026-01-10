package com.artifyapplication;

public class ArtifyApp {
	public static void main(String[] args) {
		//creating User
		User user = new User("Ishan",50000);
		
		//creating Artwork
		Artwork art1 = new DigitalArt("Digital Painting", "Anvesh", 1200);
		art1.license();
		art1.purchase(user);
		System.out.println("============================================");
		//creating Artwork
		Artwork art2 = new PrintArt("Madhuwani Painting", "Ananya", 25000);
		art2.license();
		art2.purchase(user);
	}
}
