package com.generics.airesumescreeningsystem;

public class Resume<T extends JobRole> {

	// class attributes
	private T jobRole;

	// method for initializing resume
	public Resume(T jobRole) {
		this.jobRole = jobRole;
	}

	// method for processing resume
	public void processResume() {
		jobRole.screen();
	}

	// method for getting job role
	public T getJobRole() {
		return jobRole;
	}
}
