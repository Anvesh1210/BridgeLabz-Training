package com.constructor.levelone;

//Driver class for Student class
public class StudentDriver {
	 public static void main(String[] args) {

		 	//creating Student object
	        Student s1 = new Student(101, "Anvesh", 8.5);
	        
	        //calling method to display details
	        s1.displayStudent();
	        
	        System.out.println();

	        //creating object of sub class
	        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Rahul", 9.1, "Computer Science");
	        pg1.displayPGStudent();

	        // Modifying CGPA using public setter
	        pg1.setCGPA(9.4);
	        System.out.println("\nAfter updating CGPA:");
	        pg1.displayPGStudent();
	    }
}
