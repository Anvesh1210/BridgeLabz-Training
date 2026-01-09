package com.loanbuddyapplication;

public class LoanApplication {
	//Loan Application Fields
	String loanType;
	int term;
	double interestRate;
	
	//constructor to initialize Loan Application fields
	public LoanApplication(String loanType, int term, double interestRate) {
		this.loanType = loanType;
		this.term = term;
		this.interestRate = interestRate;
	}
	
	//Displaying Loan Application
	public void displayLoanApplication() {
		System.out.println("Loan Application: ");
		System.out.println("Loan Type: "+loanType);
		System.out.println("Term "+term);
		System.out.println("Interest Rate: "+interestRate);
	}
}
