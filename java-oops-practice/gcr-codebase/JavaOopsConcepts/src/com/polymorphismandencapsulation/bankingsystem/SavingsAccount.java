package com.polymorphismandencapsulation.bankingsystem;

//class to represent a Savings Account
public class SavingsAccount extends BankAccount implements Loanable {

	private static final double INTEREST_RATE = 4.0;

	public SavingsAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	//interest calculation for savings account	
	@Override
	public void calculateInterest() {
		double interest = getBalance() * INTEREST_RATE / 100;
		setBalance(getBalance() + interest);
		System.out.println("Savings Interest Added: " + interest);
	}

	@Override
	public void applyForLoan() {
		System.out.println("Loan application submitted for Savings Account.");
	}

	@Override	
	public double calculateLoanEligibility() {
		return getBalance() * 5;
	}
}

