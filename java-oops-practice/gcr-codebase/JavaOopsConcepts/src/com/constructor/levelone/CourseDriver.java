package com.constructor.levelone;

public class CourseDriver {
	public static void main(String[] args) {
		
		//Creating Course class objects
		Course c1 = new Course("Java Full Stack", 6, 45000);
	    Course c2 = new Course("Data Science", 8, 60000);

	    //displaying institute name and course details
	    System.out.println("Before updating institute name:");
	    c1.displayCourseDetails();
	    c2.displayCourseDetails();
	    
        // Update institute name using class method
        Course.updateInstituteName("TechEdge Academy");

        System.out.println("\nAfter updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
	    }
}
