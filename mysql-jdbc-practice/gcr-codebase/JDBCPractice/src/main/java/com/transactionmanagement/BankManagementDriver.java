package com.transactionmanagement;

import java.util.Scanner;

public class BankManagementDriver {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankService service = new BankService();

		boolean running = true;

		while (running) {

			System.out.println("\n===== Banking System =====");
			System.out.println("1. Transfer Money");
			System.out.println("2. Check Balance");
			System.out.println("3. Transaction History");
			System.out.println("4. Exit");

			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> service.transferMoney();
			case 2 -> service.checkBalance();
			case 3 -> service.transactionHistory();
			case 4 -> running = false;
			default -> System.out.println("Invalid choice!");
			}
		}

		sc.close();
	}
}
