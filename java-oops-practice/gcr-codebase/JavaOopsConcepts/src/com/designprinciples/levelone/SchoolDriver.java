package com.designprinciples.levelone;

//class to use School
public class SchoolDriver {
	public static void main(String[] args) {

        //creating School object
        School school = new School("Green Valley School");

        // Students (Independent objects)
        Student rohan = new Student("Rohan");
        Student priya = new Student("Priya");

        //creating school objects
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        //adding student to School
        school.addStudent(rohan);
        school.addStudent(priya);

        //calling enrllCouse() method
        rohan.enrollCourse(math);
        rohan.enrollCourse(science);

        priya.enrollCourse(science);

        //displaying results
        school.showStudents();
        rohan.viewCourses();
        priya.viewCourses();

        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
