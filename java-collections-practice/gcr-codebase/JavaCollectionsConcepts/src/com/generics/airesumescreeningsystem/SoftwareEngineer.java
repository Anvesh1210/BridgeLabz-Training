package com.generics.airesumescreeningsystem;

public class SoftwareEngineer extends JobRole {

	// method for initializing software engineer role
	public SoftwareEngineer(String candidateName) {
		super(candidateName);
	}

	// method for screening software engineer resume
	@Override
	public void screen() {
		System.out.println(candidateName + " screened for Software Engineer role");
	}
}
