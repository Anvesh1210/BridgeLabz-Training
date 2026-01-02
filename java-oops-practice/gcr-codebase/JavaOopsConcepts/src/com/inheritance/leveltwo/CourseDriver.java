package com.inheritance.leveltwo;

//class to use course class
public class CourseDriver {
	 public static void main(String[] args) {
		 //creating course class objects
	     Course c1 = new Course("Java Basics", 40);
	     Course c2 = new OnlineCourse("Spring Framework", 60,"Udemy", true);
	     Course c3 = new PaidOnlineCourse("Advanced Java",80,"Coursera",true,12000,20);
	     
	     //displaying course details
	     System.out.println("---- Course Details ----\n");
         c1.displayDetails();
         System.out.println();
         c2.displayDetails();
         System.out.println();
         c3.displayDetails();
	 }
}
