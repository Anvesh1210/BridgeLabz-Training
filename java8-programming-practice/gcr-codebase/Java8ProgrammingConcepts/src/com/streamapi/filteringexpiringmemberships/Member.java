package com.streamapi.filteringexpiringmemberships;

import java.time.LocalDate;

//class representing a member
public class Member {
	// member attributes
	private String name;
	private LocalDate expiryDate;

	public Member(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}

	public String getName() {
		return name;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}
}
