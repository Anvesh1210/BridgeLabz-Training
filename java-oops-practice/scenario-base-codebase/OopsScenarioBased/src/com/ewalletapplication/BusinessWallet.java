package com.ewalletapplication;
//class to represent business wallet
public class BusinessWallet extends Wallet {

	//parameterized constructor to take balance
    public BusinessWallet(double balance) {
        super(balance);
    }

    //overridden method transferTo() to verify the transaction
    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02; // 2% transaction tax
        double total = amount + tax;

        if (debit(total)) {
            receiver.getWallet().credit(amount);
            System.out.printf("Transfer Successful (Business Wallet)%n");
            System.out.printf("Transaction Tax: %.2f%n", tax);
        } else {
            System.out.println("Insufficient Balance (Including Tax)");
        }
    }
}
