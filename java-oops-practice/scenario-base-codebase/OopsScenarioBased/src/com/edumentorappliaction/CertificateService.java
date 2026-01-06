package com.edumentorappliaction;

public class CertificateService implements ICertifiable {

    private Learner learner;
    private Quiz quiz;

    public CertificateService(Learner learner, Quiz quiz) {
        this.learner = learner;
        this.quiz = quiz;
    }

    @Override
    public void generateCertificate() {
        double percentage = quiz.getPercentage();

        if (learner.getCourseType().equalsIgnoreCase("short")) {
            System.out.println("Short Course Certificate");
            System.out.println("Minimum Required: 50%");
        } else {
            System.out.println("Full-Time Course Certificate");
            System.out.println("Minimum Required: 70%");
        }

        System.out.println("Score: " + percentage + "%");     

        if ((learner.getCourseType().equalsIgnoreCase("short") && percentage >= 50) ||
            (learner.getCourseType().equalsIgnoreCase("full-time") && percentage >= 70)) {
            System.out.println("Certificate Generated Successfully");
        } else {
            System.out.println("Certificate Not Eligible");
        }
    }
	
}
