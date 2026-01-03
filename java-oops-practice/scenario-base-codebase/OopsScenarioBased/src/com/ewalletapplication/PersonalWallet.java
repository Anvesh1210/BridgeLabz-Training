package com.ewalletapplication;

//class to represent Personal Wallet
public class PersonalWallet extends Wallet {

	//constructor to take balance
    public PersonalWallet(double balance) {
        super(balance);
    }

    //overridden method transferTo()
    @Override
    public void transferTo(User receiver, double amount) {
        if (debit(amount)) {
            receiver.getWallet().credit(amount);
            System.out.println("Transfer Successful (Personal Wallet)");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
