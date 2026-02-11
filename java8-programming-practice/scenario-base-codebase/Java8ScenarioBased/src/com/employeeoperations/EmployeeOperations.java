package com.employeeoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EmployeeOperations {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Anvesh", 24, "Male", "IT", 2022, 50000),
				new Employee(2, "Riya", 26, "Female", "HR", 2021, 45000),
				new Employee(3, "Rohit", 28, "Male", "Finance", 2013, 60000),
				new Employee(4, "Sneha", 23, "Female", "IT", 2023, 40000),
				new Employee(5, "Amit", 30, "Male", "HR", 2014, 70000),
				new Employee(6, "Ashish", 21, "Male", "Product Development", 2025, 35000),
				new Employee(8, "Kunal", 27, "Male", "Sales", 2020, 48000),
				new Employee(9, "Neha", 25, "Female", "Sales", 2021, 52000),
				new Employee(10, "Vikram", 29, "Male", "Sales", 2019, 65000));

//=============================================================================================================

		// Finding how many male and female employees are there in the organization
		System.out.println("1. How many male and female employees are there in the organization ?");
		Predicate<Employee> isMale = (e) -> e.getGender().equals("Male");
		Predicate<Employee> isFemale = (e) -> e.getGender().equals("Female");

		int maleCount = 0;
		int femaleCount = 0;

		for (Employee e : employees) {
			if (isMale.test(e)) {
				maleCount++;
			} else if (isFemale.test(e)) {
				femaleCount++;
			}
		}

		System.out.println("Number of Male Employees: " + maleCount);
		System.out.println("Number of female Employees: " + femaleCount);

//=========================================================================================================

		// 2. Print the name of all departments in the organization ?
		System.out.println("\n2. Print the name of all departments in the organization ?");

		Consumer<List<Employee>> printDepartments = (e) -> {
			Set<String> departments = new HashSet<>();
			for (Employee emp : e) {
				departments.add(emp.getDepartment());
			}
			System.out.println("The List of departments in the organization: ");
			for (String d : departments) {
				System.out.println(d);
			}
		};

		printDepartments.accept(employees);

//===========================================================================================================

		// 3. What is the average age of male and female employees?
		int maleAge = 0;
		int femaleAge = 0;
		System.out.println("\n3. What is the average age of male and female employees?");

		for (Employee e : employees) {
			if (isMale.test(e)) {
				maleAge += e.getAge();
			} else if (isFemale.test(e)) {
				femaleAge += e.getAge();
			}
		}

		System.out.println("The Average age of Male Employees: " + ((double) maleAge / maleCount));
		System.out.println("The Average age of Female Employees: " + ((double) femaleAge / femaleCount));

//=========================================================================================================

		// 4. Get the details of highest paid employee in the organization ?
		System.out.println("\n4. Get the details of highest paid employee in the organization ?");
		Supplier<Employee> highestPaidEmp = () -> {
			Employee hightestPaidEmp = null;
			double hightestSalary = Integer.MIN_VALUE;
			for (Employee e : employees) {
				if (e.getSalary() > hightestSalary) {
					hightestSalary = e.getSalary();
					hightestPaidEmp = e;
				}
			}
			return hightestPaidEmp;
		};

		System.out.println("Highest paid Employee: ");
		System.out.println(highestPaidEmp.get());

//=========================================================================================================

		// 5. Get the names of all employees who have joined after 2015 ?
		System.out.println("\n5. Get the names of all employees who have joined after 2015 ?");
		Supplier<List<Employee>> employeeAfter2015 = () -> {
			List<Employee> after2015 = new ArrayList<Employee>();
			for (Employee e : employees) {
				if (e.getYearOfJoining() > 2015) {
					after2015.add(e);
				}
			}
			return after2015;
		};

		System.out.println("Employee which join after 2015: ");
		for (Employee e : employeeAfter2015.get()) {
			System.out.println(e);
		}

//=========================================================================================================
		// 6. Count the number of employees in each department ?
		System.out.println("\n6. Count the number of employees in each department ?");

		Function<List<Employee>, Map<String, Integer>> countDeptEmployee = (e) -> {
			Map<String, Integer> count = new HashMap<String, Integer>();
			for (Employee emp : employees) {
				count.put(emp.getDepartment(), count.getOrDefault(emp.getDepartment(), 0) + 1);
			}
			return count;
		};

		System.out.println("Employees in each department: ");
		System.out.println(countDeptEmployee.apply(employees));

//=========================================================================================================

		// 7. What is the average salary of each department ?
		System.out.println("\n7. What is the average salary of each department");
		Map<String, Double> avgSalary = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		avgSalary.forEach((dept, avg) -> System.out.println(dept + " : " + avg));

//=========================================================================================================
		// 8. Get the details of youngest male employee in the product development
		// department ?
		System.out.println("\n8. Get the details of youngest male employee in the product development department ?");
		Employee youngestMale = employees.stream().filter((e) -> e.getGender().equals("Male"))
				.filter((e) -> e.getDepartment().equals("Product Development"))
				.min(Comparator.comparingInt(Employee::getAge)).orElse(null);

		System.out.println(youngestMale);

//===========================================================================================================
		// 9. Who has the most working experience in the organization?
		System.out.println("\n9. Who has the most working experience in the organization?");
		Employee mostWorkingEmp = employees.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get();
		System.out.println(mostWorkingEmp);

//=============================================================================================================
		// 10. How many male and female employees are there in the Sales team?
		System.out.println("\n10. How many male and female employees are there in the Sales team?");
		Map<String, Long> count = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Sales"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(count);

//=============================================================================================================
		// 11. What is the average salary of male and female employees ?
		System.out.println("\n11. What is the average salary of male and female employees ?");
		Map<String, Double> avgSalaryByGender = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

		avgSalaryByGender.forEach((gender, avg) -> System.out.println(gender + " : " + avg));

//=============================================================================================================
		// 12. List down the names of all employees in each department ?
		System.out.println("\n12. List down the names of all employees in each department ?");

		Map<String, List<String>> employeesByDept = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));

		employeesByDept.forEach((dept, names) -> {
			System.out.println(dept + " : " + names);
		});

//==============================================================================================================
		// 13. What is the average salary and total salary of the whole organization?
		System.out.println("\n13. What is the average salary and total salary of the whole organization?");
		double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();

		double averageSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);

		System.out.println("Total Salary : " + totalSalary);
		System.out.println("Average Salary : " + averageSalary);

//=============================================================================================================
		//14. Get the employee whose salary are more than 25k.
		System.out.println("\n14. Get the employee whose salary are more than 25k.");	
		employees.stream().filter(e->e.getSalary()>25000).toList().forEach(e -> System.out.println(e));

//=============================================================================================================
		//15.Who is the highest paid employee in the organization?
		System.out.println("\n15.Who is the highest paid employee in the organization?");
		System.out.println(employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null));
		
//=============================================================================================================
		//16.Who is the second highest paid employee in the organization?
		System.out.println("\n16.Who is the second highest paid employee in the organization?");
		System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst());
		
//=============================================================================================================
		//17.Who is the third highest paid employee in the organization?
		System.out.println("\n17.Who is the third highest paid employee in the organization?");
		System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst());
	
//=============================================================================================================
		//18.Who is the lowest paid employee in the organization?
		System.out.println("\n18.Who is the lowest paid employee in the organization?");
		System.out.println(employees.stream().min(Comparator.comparing(Employee::getSalary)));
	
//=============================================================================================================
		//19.Who is the second lowest paid employee in the organization?
		System.out.println("\n19.Who is the second lowest paid employee in the organization?");
		System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst());
		
//============================================================================================================
		//20.Get the first five lowest paid employee in the organization?
		System.out.println("\n20.Get the first five lowest paid employee in the organization?");
		employees.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(5).forEach(e->System.out.println(e));
		
		//21.Get the first five highest paid employee in the organization?
		System.out.println("\n21.Get the first five highest paid employee in the organization?");
		employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(5).forEach(e->System.out.println(e));
	}
}
