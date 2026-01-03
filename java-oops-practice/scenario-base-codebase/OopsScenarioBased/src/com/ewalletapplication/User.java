package com.ewalletapplication;

//class to represent a User
public class User {
	
	//user attributes
    private String name;
    private Wallet wallet;

    //parameterized constructor to initialize user attributes
    public User(String name, Wallet wallet, boolean referral) {
        this.name = name;
        this.wallet = wallet;

        if (referral) {
            wallet.credit(100); // Referral bonus
        }
    }

    //getter method for wallet
    public Wallet getWallet() {
        return wallet;
    }

    //method to display user details
    public void displayUser() {
        System.out.println("----------------------------------");
        System.out.printf("User Name      : %s%n", name);
        System.out.printf("Wallet Balance : %.2f%n", wallet.getBalance());
        System.out.println("----------------------------------");
    }
}
