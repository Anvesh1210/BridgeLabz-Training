package com.transactionmanagement;

import java.util.List;
import java.util.Scanner;

public class BankService {

	private BankDAO dao = new BankDAO();
	private Scanner sc = new Scanner(System.in);

	public void transferMoney() {

		System.out.print("From Account ID: ");
		int from = sc.nextInt();

		System.out.print("To Account ID: ");
		int to = sc.nextInt();

		System.out.print("Amount: ");
		double amount = sc.nextDouble();

		if (dao.transferMoney(from, to, amount))
			System.out.println("Transfer Successful!");
		else
			System.out.println("Transfer Failed!");
	}

	public void checkBalance() {

		System.out.print("Enter Account ID: ");
		int id = sc.nextInt();

		double balance = dao.getBalance(id);

		if (balance >= 0)
			System.out.println("Balance: " + balance);
		else
			System.out.println("Account Not Found!");
	}

	public void transactionHistory() {

		System.out.print("Enter Account ID: ");
		int id = sc.nextInt();

		List<Transaction> list = dao.getTransactionHistory(id);
		list.forEach(System.out::println);
	}
}
