package com.loanbuddyapplication;

public class HomeLoan extends Loan {

    public HomeLoan(Applicant applicant, LoanApplication loanApplication) {
        super(applicant, loanApplication);
    }

    @Override
    protected int getMinimumCreditScore() {
        return 700; // stricter than personal loan
    }

    @Override
    protected double getIncomeMultiplier() {
        return applicant.getIncome() * 0.4; // 40% of income
    }

    @Override
    public double calculateEMI() {
        // Simple EMI logic (can be improved later)
        return applicant.getLoanAmount() / loanApplication.term;
    }
}
