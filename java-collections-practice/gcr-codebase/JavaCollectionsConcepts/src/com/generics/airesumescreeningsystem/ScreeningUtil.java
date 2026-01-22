package com.generics.airesumescreeningsystem;

import java.util.List;

public class ScreeningUtil {

	// method for screening all resumes using wildcard
	public static void screenAll(List<? extends JobRole> roles) {
		for (JobRole role : roles) {
			role.screen();
		}
	}

	// method for screening single resume using generic method
	public static <T extends JobRole> void screenOne(T role) {
		role.screen();
	}
}
