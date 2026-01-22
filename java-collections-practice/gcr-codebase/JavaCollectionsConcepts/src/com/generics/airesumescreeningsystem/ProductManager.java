package com.generics.airesumescreeningsystem;

public class ProductManager extends JobRole {

	// method for initializing product manager role
	public ProductManager(String candidateName) {
		super(candidateName);
	}

	// method for screening product manager resume
	@Override
	public void screen() {
		System.out.println(candidateName + " screened for Product Manager role");
	}
}
