package com.designprinciples.levelone;
import java.util.ArrayList;

//class to represent University
public class University {
	private String universityName;
    private ArrayList<Department> departments;  
    private ArrayList<Faculty> faculties;        

    //Parameterized constructor to initialize university
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    //method to add department in university
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    //method to ass Faculty in university
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    //method to show department details 
    public void showUniversityDetails() {
        System.out.println("\nUniversity: " + universityName);

        System.out.println("Departments:");
        for (Department dept : departments) {
            System.out.println("- " + dept.departmentName);
        }

        System.out.println("Faculty Members:");
        for (Faculty fac : faculties) {
            System.out.println("- " + fac.getFacultyName());
        }
    }

    //method for deletion of university
    public void deleteUniversity() {
        departments.clear();
        System.out.println("\nUniversity deleted. All departments removed.");
    }

    //Inner Department class Department
    class Department {
        private String departmentName;

        private Department(String departmentName) {
            this.departmentName = departmentName;
        }
    }
}
