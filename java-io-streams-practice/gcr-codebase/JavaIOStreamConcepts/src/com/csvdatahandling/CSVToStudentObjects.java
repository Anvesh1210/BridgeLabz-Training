package com.csvdatahandling;

import java.io.*;
import java.util.*;

public class CSVToStudentObjects {
	// Student POJO class
	static class Student {
		String id;
		String name;
		int age;
		int marks;
		
		//constructor to initialize student
		Student(String id, String name, int age, int marks) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.marks = marks;
		}

		// Display student details
		public void display() {
			System.out.println(id + " , " + name + " , " + age + " ," + marks);
		}
	}

	//main method
	public static void main(String[] args) {
		//csv file location
		String filePath = "students.csv";
		//student list
		List<Student> studentList = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			br.readLine(); // skip header
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				// Createing Student object
				Student s = new Student(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));
				studentList.add(s);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Student List:");
		for (Student s : studentList) {
			s.display();
		}
	}
}
