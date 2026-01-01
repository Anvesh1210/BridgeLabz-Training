package com.inheritance.levelone;

public class EmpolyeeDriver {
  public static void main(String[] args) {
	  //creating employees
	  Employee e1 = new Manager("Rohit",101,80000, 10);
	  Employee e2 = new Developer("Anvesh",102,60000,"Java");
	  Employee e3 = new Intern("Aman",103,15000,6);

	  System.out.println("----- Employee Details -----\n");
	  
	  //Displaying details
	  e1.displayDetails();
	  System.out.println();

	  e2.displayDetails();
	  System.out.println();

	  e3.displayDetails();
  	 }
}

