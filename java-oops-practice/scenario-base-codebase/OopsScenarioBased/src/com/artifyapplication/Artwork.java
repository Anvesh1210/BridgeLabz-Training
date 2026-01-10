package com.artifyapplication;

public abstract class Artwork implements IPurchasable{
	protected String title;
	protected String artist;
	protected double price;
	protected String licenseType;
	
	public Artwork(String title, String artiest, double price) {
		this.title = title;
		this.artist = artiest;
		this.price = price;
	}
	
	public void printDetails() {
		System.out.println("Artwork details: ");
		System.out.println("Title: " + title);
		System.out.println("Artist: " + artist);
		System.out.println("Price: " + price);
		System.out.println("License Type: " + title);
	}
	
	//method to purchase a Artwork
	@Override
	public void purchase(User user) {
		if(!licenseType.equals(null)) {
			if(user.getWalletBalnce() < price) {
				System.out.println("Wallet Balance is not sufficient!!!");
			}else {
				System.out.println("\nArt Purchased in Amount: "+price);
				System.out.println();
				printDetails();
				user.deduceBalance(price);
			}
		}else {
			System.out.println("First give a License to your Art");
		}
	}
}
