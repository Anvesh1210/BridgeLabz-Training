package com.inheritance.leveltwo;

//Main class to demonstrate hierarchical inheritance
public class BankAccountDriver {
	 public static void main(String[] args) {

	        // Creating objects using parent reference
	        BankAccount acc1 = new SavingsAccount("SB1001", 50000, 4.5);
	        BankAccount acc2 = new CheckingAccount("CA2001", 30000, 20000);
	        BankAccount acc3 = new FixedDepositAccount("FD3001", 100000, 24, 6.8);

	        // Display account details
	        System.out.println("---- Account Details ----\n");

	        acc1.displayBasicDetails();
	        acc1.displayAccountType();
	        System.out.println();

	        acc2.displayBasicDetails();
	        acc2.displayAccountType();
	        System.out.println();

	        acc3.displayBasicDetails();
	        acc3.displayAccountType();
	    }
}
