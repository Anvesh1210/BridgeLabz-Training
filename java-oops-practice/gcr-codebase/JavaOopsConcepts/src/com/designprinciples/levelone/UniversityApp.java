package com.designprinciples.levelone;

public class UniversityApp {
	public static void main(String[] args) {
        //create Courses
        Course2 c1 = new Course2("CS101", "Intro to Java");
        Course2 c2 = new Course2("CS102", "Data Structures");
        Course2 c3 = new Course2("MATH201", "Calculus II");

        //create Professors
        Professor prof1 = new Professor("Alan Turing", "Computer Science");
        Professor prof2 = new Professor("Katherine Johnson", "Mathematics");

        //create Students
        Student2 s1 = new Student2("Alice", 1001);
        Student2 s2 = new Student2("Bob", 1002);
        Student2 s3 = new Student2("Charlie", 1003);

        System.out.println("--- University System Initialization ---\n");

        //assign Professors 
        prof1.assignToCourse(c1);
        prof1.assignToCourse(c2);
        prof2.assignToCourse(c3);

        System.out.println("");

        //enroll Students 
        s1.enrollInCourse(c1);
        s1.enrollInCourse(c3);
        
        s2.enrollInCourse(c1);
        
        s3.enrollInCourse(c2);
        s3.enrollInCourse(c3);

        //display State
        c1.showRoster();
        s1.showTranscript();
        prof1.showTeachingSchedule();
    }
}
