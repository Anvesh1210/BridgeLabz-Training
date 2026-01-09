package com.loanbuddyapplication;

public class AutoLoan extends Loan {

    public AutoLoan(Applicant applicant, LoanApplication loanApplication) {
        super(applicant, loanApplication);
    }

    @Override
    protected int getMinimumCreditScore() {
        return 680;
    }

    @Override
    protected double getIncomeMultiplier() {
        return applicant.getIncome() * 0.35; 
    }

    @Override
    public double calculateEMI() {
        return applicant.getLoanAmount() / loanApplication.term;
    }
}
