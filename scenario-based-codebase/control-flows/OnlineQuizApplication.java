import java.util.Scanner;

//Online quiz Application
public class OnlineQuizApplication {
    public static void main(String[] args) {

		//creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Questions array
        String[] questions = {
                "Which language is platform independent?",
                "Which keyword is used to inherit a class in Java?",
                "Which method is the entry point of Java program?",
                "Which of these is not a primitive data type?",
                "Which operator is used to compare two values?"
        };

		//option and Answer array
        String[][] options = {
                {"A. C", "B. C++", "C. Java", "D. Python", "C"},
                {"A. implement", "B. extends", "C. inherits", "D. super", "B"},
                {"A. start()", "B. run()", "C. main()", "D. init()", "C"},
                {"A. int", "B. float", "C. String", "D. char", "C"},
                {"A. =", "B. ==", "C. !=", "D. <>", "B"}
        };

        int score = 0;
        char userAnswer;

        // Quiz logic
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQ" + (i + 1) + ". " + questions[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            userAnswer = sc.next().toUpperCase().charAt(0);
            if (userAnswer == 'A' || userAnswer == 'B' ||
                userAnswer == 'C' || userAnswer == 'D') {

                if (String.valueOf(userAnswer).equals(options[i][4])) {
                    score++;
                }

            } else {
                System.out.println("Invalid option selected");
            }
        }

        //Showing Results
        System.out.println("\nQuiz Completed");
        System.out.println("Your Score: " + score + " out of " + questions.length);

		//closing Scanner object
        sc.close();
    }
}
