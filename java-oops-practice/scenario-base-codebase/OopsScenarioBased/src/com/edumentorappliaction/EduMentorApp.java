package com.edumentorappliaction;

public class EduMentorApp {
    public static void main(String[] args) {

    	//creating Learner object
        Learner learner = new Learner("Anvesh", "anvesh@gmail.com", 101, "full-time");

        //questions array
        String[] questions = {
                "What is Java?",
                "Full form of OOP?",
                "Full form of JVM?"
        };

        //correct answer array
        String[] correctAnswers = {
                "programming language",
                "object oriented programming",
                "java virtual machine"
        };

        //making Quiz object
        Quiz quiz = new Quiz(questions, correctAnswers);

        System.out.println("===== Quiz Started =====");
        quiz.conductQuiz();

        //generating certificate
        ICertifiable certificate = new CertificateService(learner, quiz);
        certificate.generateCertificate();
    }
}
