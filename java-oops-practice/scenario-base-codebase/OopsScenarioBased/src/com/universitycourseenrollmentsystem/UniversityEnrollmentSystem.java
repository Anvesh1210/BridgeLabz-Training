package com.universitycourseenrollmentsystem;

//class to run University Enrollment Application
public class UniversityEnrollmentSystem {
	public static void main(String[] args) {

		//creating student and course objects
        Student student = new Undergraduate(101, "Anvesh");
        Course course = new Course("CS101", "Core Java", 4);

        //creating enrollment object
        Enrollment enrollment = new Enrollment(student, course);

        //creating faculty object
        Faculty faculty = new Faculty("Dr. Sharma");
        
        //Assigning faculty to student and course
        faculty.assignGrade(enrollment, "A");

        //printing information
        enrollment.displayEnrollment();
    }
}
