package com.constructor.levelone;

public class BankAccountDriver {
	public static void main(String[] args) {

        //create a BankAccount object
        BankAccount acc1 = new BankAccount("ACC1001", "Anvesh", 5000);

        //display details of the BankAccount
        System.out.println("Bank Account Details:");
        acc1.displayAccount();

        System.out.println();

        //create a SavingsAccount object
        SavingsAccount sav1 =
            new SavingsAccount("SAV2001", "Rahul", 10000, 4.5);

        //display details of the SavingsAccount
        System.out.println("Savings Account Details:");
        sav1.displaySavingsAccount();

        //perform deposit operation using public method
        sav1.deposit(2000);

        //perform withdrawal operation using public method
        sav1.withdraw(1500);

        //display updated details after transactions
        System.out.println("\nAfter transactions:");
        sav1.displaySavingsAccount();
    }
}
