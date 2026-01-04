package com.polymorphismandencapsulation.bankingsystem;

//Interface defining loan-related behavior
public interface Loanable {

	//apply for loan
	void applyForLoan();

	//calculate loan eligibility amount
	double calculateLoanEligibility();
}

