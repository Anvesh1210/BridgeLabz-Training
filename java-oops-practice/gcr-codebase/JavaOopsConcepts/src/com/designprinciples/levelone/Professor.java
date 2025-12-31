package com.designprinciples.levelone;
import java.util.ArrayList;
import java.util.List;

//Class to represent professor
public class Professor {
	private String name;
    private String department;
    private List<Course2> coursesTaught; 

    //Parameterized constructor
    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
        this.coursesTaught = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    //Assigning course to the professor
    public void assignToCourse(Course2 course) {
        if (!coursesTaught.contains(course)) {
            coursesTaught.add(course);
            course.setProfessor(this);
            System.out.println("Action: Prof. " + this.name + " is now teaching " + course.getTitle());
        }
    }

    public void showTeachingSchedule() {
        System.out.println("\n Schedule for Prof. " + name);
        if (coursesTaught.isEmpty()) {
            System.out.println("No active courses.");
        } else {
            for (Course2 c : coursesTaught) {
                System.out.println("- " + c.getTitle() + " (" + c.getCode() + ")");
            }
        }
    }
}
