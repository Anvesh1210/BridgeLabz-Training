package com.polymorphismandencapsulation.bankingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
    		
    		//creating Scanner object
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        //asking user for no of account creation
        System.out.print("How many accounts do you want to create? ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("\nSelect Account Type:");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            int choice = sc.nextInt();

            //wrong input handling
            if (choice != 1 && choice != 2) {
                System.out.println("❌ Wrong input! Please choose 1 or 2 only.");
                i--;          // repeat the same iteration
                continue;
            }

            System.out.print("Enter Account Number: ");
            String accNo = sc.next();

            System.out.print("Enter Holder Name: ");
            String name = sc.next();

            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            BankAccount account;

            if (choice == 1) {
                account = new SavingsAccount(accNo, name, balance);
            } else {
                account = new CurrentAccount(accNo, name, balance);
            }

            accounts.add(account);
        }

        //printing account details
        System.out.println("\n----- Account Processing -----");

        for (BankAccount acc : accounts) {

            System.out.println("\nAccount Number : " + acc.accountNumber);
            System.out.println("Holder Name    : " + acc.holderName);
            System.out.println("Balance Before : " + acc.getBalance());

            acc.calculateInterest(); 

            System.out.println("Balance After  : " + acc.getBalance());

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                loan.applyForLoan();
                System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
            }

            System.out.println("--------------------------------");
        }

        sc.close();
    }
}

