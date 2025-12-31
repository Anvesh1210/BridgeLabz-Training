package com.designprinciples.levelone;

public class BankDriver {
	public static void main(String[] args) {

        // Independent objects
        Bank sbi = new Bank("State Bank of India");
        Bank hdfc = new Bank("HDFC Bank");

        Customer rohan = new Customer("Rohan");

        // Association via method calls
        sbi.openAccount(rohan, 101, 5000);
        hdfc.openAccount(rohan, 202, 12000);

        // Customer communicating with Account objects
        rohan.viewBalance();
    }
}
