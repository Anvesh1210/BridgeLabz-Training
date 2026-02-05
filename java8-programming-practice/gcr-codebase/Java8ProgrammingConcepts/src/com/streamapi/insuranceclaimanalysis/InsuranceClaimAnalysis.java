package com.streamapi.insuranceclaimanalysis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {
	public static void main(String[] args) {
		List<Claim> claims = Arrays.asList(new Claim("Health", 50000), new Claim("Vehicle", 30000),
				new Claim("Health", 70000), new Claim("Vehicle", 45000), new Claim("Life", 100000));
		Map<String, Double> avgClaims = claims.stream()
				.collect(Collectors.groupingBy(Claim::getType, Collectors.averagingDouble(Claim::getAmount)));

		avgClaims.forEach((type, avg) -> System.out.println(type + " Average Claim: " + avg));
	}
}
