package com.designprinciples.levelone;

public class CompanyDriver {
	public static void main(String[] args) {

        // Company creation
        Company company = new Company("TechNova Pvt Ltd");

        // Adding departments (employees auto-created)
        company.addDepartment("Development");
        company.addDepartment("HR");

        // Display structure
        company.displayCompanyDetails();

        // Deleting company (composition effect)
        company.deleteCompany();
    }
}
