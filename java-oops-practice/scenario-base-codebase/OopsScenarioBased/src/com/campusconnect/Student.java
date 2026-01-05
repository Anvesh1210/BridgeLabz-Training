package com.campusconnect;

public class Student extends Person implements ICourseActions{
	private int [] grades;
	private Course course;
	
	public Student(String name, String email, int id,int []grades) {
		super(name, email, id);
		this.grades=grades;
	}

	// GPA Calculation using operators
    double calculateGPA() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.length / 10;
    }
	@Override
	public void printDetails() {
		System.out.println("Student Name: "+name);
		System.out.println("Student email: "+email);
		System.out.println("student id: "+id);
		System.out.println("Student grade: "+calculateGPA());
	}
	
	 @Override
	    public void enrollCourse(Course course) {
	        this.course = course;
	        course.addStudent(this);
	    }

	    @Override
	    public void dropCourse(Course course) {
	        this.course = null;
	        course.removeStudent(this);
	    }
	
}
