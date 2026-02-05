package com.collectors.employeesalarycategorization;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryCategorization {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Anvesh", "IT", 65000));
		employees.add(new Employee("Rahul", "HR", 45000));
		employees.add(new Employee("Zoya", "Finance", 72000));
		employees.add(new Employee("Ritika", "IT", 58000));
		employees.add(new Employee("Aman", "HR", 40000));
		employees.add(new Employee("Neha", "Finance", 81000));
		
		Map<String, Double> avgSalaryMap = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("All Department with Avg salary:");
		System.out.println(avgSalaryMap);

	}
}
