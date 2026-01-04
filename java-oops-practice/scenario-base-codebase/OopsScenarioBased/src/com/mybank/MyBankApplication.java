package com.mybank;

import java.util.Scanner;

public class MyBankApplication {

    public static void main(String[] args) {
    	
    	//creating Scanner object
        Scanner kb = new Scanner(System.in);
        Account account = null;

        //asking the user that which account he/she wants to open
        System.out.println("Which Account do you want to open:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int accountOption = kb.nextInt();

        //opening the account
        switch (accountOption) {
            case 1:
                account = new SavingsAccount("SB1001", 5000);
                System.out.println("Savings Account created successfully.");
                break;

            case 2:
                account = new CurrentAccount("CA2001");
                System.out.println("Current Account created successfully.");
                break;

            default:
                System.out.println("Invalid account option.");
                kb.close();
                return;
        }
        
        //asking the user which operation he/she wants to perform on account in loop
        int choice;
        do {
            System.out.println("\nChoose Operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");

            choice = kb.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = kb.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = kb.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: " + account.checkBalance());
                    break;

                case 4:
                    account.calculateInterest();
                    break;

                case 5:
                    System.out.println("Thank you for using MyBank.");
                    break;

                default:
                    System.out.println("Invalid operation choice.");
            }

        } while (choice != 5);

        //closing Scanner object
        kb.close();
    }
}
