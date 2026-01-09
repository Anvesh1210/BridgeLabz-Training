package com.loanbuddyapplication;

public class PersonalLoan extends Loan{

	public PersonalLoan(Applicant applicant, LoanApplication loanApplication) {
		super(applicant, loanApplication);
	}

	@Override
	protected int getMinimumCreditScore() {
		return 650;
	}

	@Override
	protected double getIncomeMultiplier() {
		return applicant.getIncome()*0.5;
	}

	@Override
	public double calculateEMI() {
		return applicant.getLoanAmount()/loanApplication.term;
	}
	
	
}
