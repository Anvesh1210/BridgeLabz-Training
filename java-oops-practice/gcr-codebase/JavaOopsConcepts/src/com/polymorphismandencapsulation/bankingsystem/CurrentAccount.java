package com.polymorphismandencapsulation.bankingsystem;

//class to represent a current account
public class CurrentAccount extends BankAccount implements Loanable {

	private static final double INTEREST_RATE = 2.0;

	public CurrentAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	//interest calculation for current account
	@Override
	public void calculateInterest() {
		double interest = getBalance() * INTEREST_RATE / 100;
		setBalance(getBalance() + interest);
		System.out.println("Current Interest Added: " + interest);
	}

	@Override
	public void applyForLoan() {
		System.out.println("Loan application submitted for Current Account.");
	}

	@Override
	public double calculateLoanEligibility() {
		return getBalance() * 3;
	}
}

