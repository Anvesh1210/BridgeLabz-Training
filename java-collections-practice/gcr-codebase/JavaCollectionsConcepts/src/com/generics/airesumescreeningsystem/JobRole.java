package com.generics.airesumescreeningsystem;

public abstract class JobRole {

	// class attributes
	protected String candidateName;

	// method for initializing candidate name
	public JobRole(String candidateName) {
		this.candidateName = candidateName;
	}

	// method for getting candidate name
	public String getCandidateName() {
		return candidateName;
	}

	// method for screening resume
	public abstract void screen();
}
