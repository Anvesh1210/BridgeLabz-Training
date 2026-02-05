package com.collectors.studentresultgrouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentGroup {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Anvesh", "A"));
		students.add(new Student("Rahul", "B"));
		students.add(new Student("Zoya", "A"));
		students.add(new Student("Ritika", "C"));
		students.add(new Student("Aman", "B"));
	    Map <String,List<Student>> map =students.stream().collect(Collectors.groupingBy(Student::getGrade));
	    System.out.println(map);
	}
}
