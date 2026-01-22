package com.generics.universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class UniversityDriver {

	public static void main(String[] args) {

		// class attributes
		Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Data Structures"));
		Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("Web Development"));  
		Course<ResearchCourse> researchCourse = new Course<>(new ResearchCourse("AI Research"));

		// method for displaying individual courses
		examCourse.displayCourse();
		assignmentCourse.displayCourse();
		researchCourse.displayCourse();

		// class attributes
		List<CourseType> allCourses = new ArrayList<>();
		allCourses.add(new ExamCourse("Operating Systems"));
		allCourses.add(new AssignmentCourse("Software Engineering"));
		allCourses.add(new ResearchCourse("Machine Learning"));

		System.out.println("\nAll Courses:");
		CourseUtil.displayAllCourses(allCourses);
	}
}
