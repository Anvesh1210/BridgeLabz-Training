package com.generics.airesumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningDriver {

	public static void main(String[] args) {

		// class attributes
		Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Anvesh"));
		Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Rahul"));
		Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Sneha"));

		// method for processing individual resumes
		seResume.processResume();
		dsResume.processResume();
		pmResume.processResume();

		// class attributes
		List<JobRole> screeningPipeline = new ArrayList<>();
		screeningPipeline.add(new SoftwareEngineer("Amit"));
		screeningPipeline.add(new DataScientist("Neha"));
		screeningPipeline.add(new ProductManager("Rohit"));

		System.out.println("\nBulk Screening");

		// method for screening multiple job roles
		ScreeningUtil.screenAll(screeningPipeline);
	}
}
