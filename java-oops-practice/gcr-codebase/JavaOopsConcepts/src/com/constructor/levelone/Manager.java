package com.constructor.levelone;

public class Manager extends Employee {
    private String level;

    	//constructor
    public Manager(int employeeID, String department, double salary, String level) {
        super(employeeID, department, salary);
        this.level = level;
    }

    //accessing public and protected members
    public void displayManager() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID : " + employeeID);   // public
        System.out.println("Department  : " + department);   // protected
        System.out.println("Salary      : ₹" + getSalary()); // private via getter
        System.out.println("Level       : " + level);
    }
}

