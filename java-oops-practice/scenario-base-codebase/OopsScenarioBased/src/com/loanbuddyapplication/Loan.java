package com.loanbuddyapplication;

public abstract class Loan implements IApprovable   {
	protected Applicant applicant;
	protected LoanApplication loanApplication;
	protected String loanStatus;
	protected double emi;
	
	public Loan(Applicant applicant, LoanApplication loanApplication) {
		this.applicant = applicant;
		this.loanApplication = loanApplication;
		this.loanStatus = "Applied";
	}

	@Override
	public boolean approveLoan() {
		loanStatus= "Under Review";
		
		if(!applicant.hasGoodcradit(getMinimumCreditScore())) {
			loanStatus="Rajected";
			return false;
		}
		
		double monthlyEMI = calculateEMI();
		double maxAllowedEMI = applicant.getIncome();
		if(monthlyEMI> maxAllowedEMI) {
			loanStatus = "Rajected";
			return false;
		}
		loanStatus ="Approved";
		emi = monthlyEMI;
		return true;
	}

	protected abstract int getMinimumCreditScore();
    protected abstract double getIncomeMultiplier();
}
