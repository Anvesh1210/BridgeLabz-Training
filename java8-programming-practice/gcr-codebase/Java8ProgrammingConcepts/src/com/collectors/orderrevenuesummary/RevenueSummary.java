package com.collectors.orderrevenuesummary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RevenueSummary {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
                new Order("Anvesh", 1200.50),
                new Order("Rahul", 850.00),
                new Order("Anvesh", 499.99),
                new Order("Zoya", 1500.00),
                new Order("Rahul", 300.00)
        );
		
		Map<String, Double> totalBillMap = orders.stream().collect(Collectors.groupingBy(Order::getCustomerName,Collectors.summingDouble(Order::getTotalBill)));
		System.out.println("BILL SUMMERY");
		System.out.println(totalBillMap);
	}
}
