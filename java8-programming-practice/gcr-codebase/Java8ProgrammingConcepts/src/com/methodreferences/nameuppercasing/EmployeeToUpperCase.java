package com.methodreferences.nameuppercasing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeToUpperCase {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Anvesh", 101), new Employee("Washim", 102),
				new Employee("Ayush", 103));
		System.out.println("before converting to uppercase");
		employees.forEach(Employee::print);
		
		System.out.println("\nAfter converting to Uppercase");
		List<Employee>upperCaseString = employees.stream().map(emp -> {emp.setName(emp.getName().toUpperCase());
		return emp;
        })
        .collect(Collectors.toList());
	
		upperCaseString.forEach(Employee::print);
	}
}
