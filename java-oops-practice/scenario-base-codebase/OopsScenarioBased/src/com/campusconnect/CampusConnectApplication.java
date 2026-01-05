package com.campusconnect;

public class CampusConnectApplication {
	public static void main(String[] args) {

        //creating Faculty
        Faculty faculty = new Faculty(
                "Dr. Sharma",
                "sharma@college.edu",
                101,
                "Computer Science"
        );

        //creating Course
        Course javaCourse = new Course("Core Java", faculty);

        //creating Student with grades
        int[] grades = {85, 90, 88};
        Student student = new Student("Anvesh","anvesh@college.edu",201,grades);

        //enroll student
        student.enrollCourse(javaCourse);

        Person p1 = student;
        Person p2 = faculty;

        System.out.println("\n--- Student Details ---");
        p1.printDetails();

        System.out.println("\n--- Faculty Details ---");
        p2.printDetails();

        javaCourse.showCourseDetails();
    }
}
