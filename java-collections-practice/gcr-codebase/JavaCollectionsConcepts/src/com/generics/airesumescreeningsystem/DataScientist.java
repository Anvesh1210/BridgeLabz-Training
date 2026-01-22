package com.generics.airesumescreeningsystem;

public class DataScientist extends JobRole {

	// method for initializing data scientist role
	public DataScientist(String candidateName) {
		super(candidateName);
	}

	// method for screening data scientist resume
	@Override
	public void screen() {
		System.out.println(candidateName + " screened for Data Scientist role");
	}
}
