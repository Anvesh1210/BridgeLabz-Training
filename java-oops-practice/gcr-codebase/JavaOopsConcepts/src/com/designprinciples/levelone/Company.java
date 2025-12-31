package com.designprinciples.levelone;

import java.util.ArrayList;

public class Company {
	 private String companyName;
	    private ArrayList<Department> departments;

	    public Company(String companyName) {
	        this.companyName = companyName;
	        this.departments = new ArrayList<>();
	    }

	    // Create and add department (composition)
	    public void addDepartment(String departmentName) {
	        departments.add(new Department(departmentName));
	    }

	    // Display company structure
	    public void displayCompanyDetails() {
	        System.out.println("\nCompany Name: " + companyName);
	        for (Department dept : departments) {
	            dept.displayDepartmentDetails();
	        }
	    }

	    // Simulate deletion of company
	    public void deleteCompany() {
	        departments.clear();  // deletes all departments and employees
	        System.out.println("\nCompany deleted along with all departments and employees.");
	    }

	    // Inner Department class (cannot exist without Company)
	    class Department {
	        private String departmentName;
	        private ArrayList<Employee> employees;

	        public Department(String departmentName) {
	            this.departmentName = departmentName;
	            this.employees = new ArrayList<>();
	            addEmployee("Default Employee"); // auto-create employee
	        }

	        public void addEmployee(String employeeName) {
	            employees.add(new Employee(employeeName));
	        }

	        public void displayDepartmentDetails() {
	            System.out.println(" Department: " + departmentName);
	            for (Employee emp : employees) {
	                System.out.println("  Employee: " + emp.employeeName);
	            }
	        }

	        // Inner Employee class (cannot exist without Department)
	        class Employee {
	            private String employeeName;

	            public Employee(String employeeName) {
	                this.employeeName = employeeName;
	            }
	        }
	    }
}
