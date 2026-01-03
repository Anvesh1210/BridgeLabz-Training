package com.ewalletapplication;

//class to use E Wallet Application
public class EWalletApplication {
	public static void main(String[] args) {

		//creating User objects
        User user1 = new User("Anvesh", new PersonalWallet(1000), true);
        User user2 = new User("Rahul", new BusinessWallet(2000), false);

        //calling displayUser() method to display user details
        user1.displayUser();
        user2.displayUser();

        //Transferring funds
        System.out.println("\n===== FUND TRANSFER =====");
        user1.getWallet().transferTo(user2, 300);

        user1.displayUser();
        user2.displayUser();

        user1.getWallet().printTransactions();
        user2.getWallet().printTransactions();
    }
}
