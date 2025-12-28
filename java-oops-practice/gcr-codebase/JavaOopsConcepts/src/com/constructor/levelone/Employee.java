package com.constructor.levelone;

public class Employee {

    //data members with access modifiers
    public int employeeID;
    protected String department;
    private double salary;

    //constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        setSalary(salary); // use setter for validation
    }

    //public getter for salary
    public double getSalary() {
        return salary;
    }

    //public setter to modify salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Setting to 0.");
            this.salary = 0;
        }
    }

    //display basic employee details
    public void displayEmployee() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : ₹" + salary);
    }
}

