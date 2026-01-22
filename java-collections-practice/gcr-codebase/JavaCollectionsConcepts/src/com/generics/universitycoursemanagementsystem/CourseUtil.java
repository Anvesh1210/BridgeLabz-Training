package com.generics.universitycoursemanagementsystem;

import java.util.List;

public class CourseUtil {
    //method for displaying all courses
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course Name: " + course.getCourseName());
            course.evaluate();
        }
    }
}
