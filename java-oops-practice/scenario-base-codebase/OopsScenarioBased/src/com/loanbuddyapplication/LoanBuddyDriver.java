package com.loanbuddyapplication;

public class LoanBuddyDriver {

    public static void main(String[] args) {
        // Create applicant
        Applicant applicant = new Applicant("Anvesh",720,50000,600000);

        // Create loan application
        LoanApplication loanApplication =new LoanApplication("PERSONAL", 60, 10.5);
        
        // Choose loan type
        Loan loan = new PersonalLoan(applicant, loanApplication);

        // Process loan
        boolean approved = loan.approveLoan();

        // Output
        applicant.displayDetails();
        System.out.println();
        loanApplication.displayLoanApplication();

        System.out.println("Loan Status: " + loan.loanStatus);

        if (approved) {
            System.out.println("EMI: " + loan.emi);
        } else {
            System.out.println("Loan was rejected.");
        }
    }
}
