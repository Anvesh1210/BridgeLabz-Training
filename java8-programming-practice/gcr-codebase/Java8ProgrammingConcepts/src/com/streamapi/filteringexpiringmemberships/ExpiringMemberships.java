package com.streamapi.filteringexpiringmemberships;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ExpiringMemberships {
	public static void main(String[] args) {
		List<Member> members = Arrays.asList(new Member("Amit", LocalDate.now().plusDays(10)),
				new Member("Riya", LocalDate.now().plusDays(40)), new Member("Suresh", LocalDate.now().plusDays(25)));

		// Members expiring within next 30 days
		members.stream().filter(m -> m.getExpiryDate().isBefore(LocalDate.now().plusDays(30)))
				.forEach(m -> System.out.println(m.getName() + " expires on " + m.getExpiryDate()));
	}
}
