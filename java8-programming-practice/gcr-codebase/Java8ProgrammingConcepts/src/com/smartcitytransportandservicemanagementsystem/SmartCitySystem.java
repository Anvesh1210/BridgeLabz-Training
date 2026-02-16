package com.smartcitytransportandservicemanagementsystem;

import java.util.*;
import java.util.stream.*;

public class SmartCitySystem {

	public static void main(String[] args) {

		// Creating transport service list
		List<TransportService> services = Arrays.asList(new BusService("A to B", 30, "08:00"),
				new MetroService("A to C", 25, "07:45"), new TaxiService("B to C", 100, "08:15"),
				new AmbulanceService("Emergency Route", 0, "NOW"));

		//Filter and sort using Lambda
		System.out.println("Sorted by Fare:");

		services.stream().sorted((s1, s2) -> Double.compare(s1.getFare(), s2.getFare()))
				.forEach(TransportService::printServiceDetails);

		//Functional interface using Lambda
		FareCalculator calculator = distance -> distance * 10;
		double distance = GeoUtils.calculateDistance(10, 25);
		double fare = calculator.calculateFare(distance);

		System.out.println("\nCalculated Fare: " + fare);

		//Display all services using forEach
		System.out.println("\nLive Dashboard:");
		services.forEach(TransportService::printServiceDetails);

		// 4. Grouping by route
		System.out.println("\nGroup By Route:");

		Map<String, List<TransportService>> grouped = services.stream()
				.collect(Collectors.groupingBy(TransportService::getRoute));

		grouped.forEach((route, list) -> {
			System.out.println("Route: " + route);
			list.forEach(TransportService::printServiceDetails);
		});

		// 5. Partitioning peak (>50 fare)
		System.out.println("\nPeak / Non-Peak:");

		Map<Boolean, List<TransportService>> partitioned = services.stream()
				.collect(Collectors.partitioningBy(s -> s.getFare() > 50));

		partitioned.forEach((isPeak, list) -> {
			System.out.println(isPeak ? "Peak Trips:" : "Non-Peak Trips:");
			list.forEach(TransportService::printServiceDetails);
		});

		// 6. Revenue summary
		System.out.println("\nRevenue Summary:");

		DoubleSummaryStatistics stats = services.stream()
				.collect(Collectors.summarizingDouble(TransportService::getFare));

		System.out.println("Total Revenue: " + stats.getSum());
		System.out.println("Average Fare: " + stats.getAverage());

		// 7. Detect emergency services
		System.out.println("\nEmergency Services:");

		services.stream().filter(s -> s instanceof EmergencyService).forEach(TransportService::printServiceDetails);
	}
}
