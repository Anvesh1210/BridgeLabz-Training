package com.lambdaexpression.notificationfiltering;

import java.util.List;
import java.util.function.Predicate;

public class HospitalApp {
	public static void main(String[] args) {
		List<Alert> alerts = List.of(new Alert("Heart rate critical", "EMERGENCY", 5),
				new Alert("Take BP medicine", "MEDICINE", 3), new Alert("Blood report ready", "REPORT", 2),
				new Alert("Low sugar level", "EMERGENCY", 4), new Alert("Doctor appointment", "REPORT", 1));
		
		Predicate<Alert> emergencyOnly = a -> a.type.equals("EMERGENCY");
		Predicate<Alert> highPriority = a -> a.priority >= 4;

		System.out.println("Filtered Alerts:\n");

        for (Alert a : alerts) {
            if (emergencyOnly.and(highPriority).test(a)) {
                System.out.println(a);
            }
        }
	}
}
