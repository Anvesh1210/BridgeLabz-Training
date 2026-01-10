package com.artifyapplication;

//class to represent a user
public class User {
	//user attributes
	private String name;
	private double walletBalnce;
	
	//constructor to initialize constructor
	public User(String name, double walletBalnce) {
		this.name = name;
		this.walletBalnce = walletBalnce;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWalletBalnce() {
		return walletBalnce;
	}

	public void setWalletBalnce(double walletBalnce) {
		this.walletBalnce = walletBalnce;
	}
	
	//method to deduce balance from the wallet 
	public void deduceBalance(double amount) {
		walletBalnce-=amount;
		System.out.println("\nBalance Deduced form Account");
		System.out.println("Remaning Balanc: "+walletBalnce);
	}
}
