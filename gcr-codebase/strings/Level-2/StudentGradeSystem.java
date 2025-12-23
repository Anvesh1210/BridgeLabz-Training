//Program to give studnet grade marking and 
import java.util.Random;
public class StudentGradeSystem {
    //Generate random PCM scores
    static int[][] generatePCMScores(int students) {
        int[][] pcm = new int[students][3];
        Random rand = new Random();
        for (int i = 0; i < students; i++) {
            pcm[i][0] = rand.nextInt(90) + 10; 
            pcm[i][1] = rand.nextInt(90) + 10; 
            pcm[i][2] = rand.nextInt(90) + 10; 
        }
        return pcm;
    }

    // Method to Calculate total, average and percentage
    static double[][] calculateResults(int[][] pcm) {
        int students = pcm.length;
        double[][] result = new double[students][3];
        for (int i = 0; i < students; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
			
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to Calculate grade
    static char[] calculateGrade(double[][] result) {
        char[] grade = new char[result.length];

        for (int i = 0; i < result.length; i++) {
            double percent = result[i][2];

            if (percent >= 80)
                grade[i] = 'A';
            else if (percent >= 70)
                grade[i] = 'B';
            else if (percent >= 60)
                grade[i] = 'C';
            else if (percent >= 50)
                grade[i] = 'D';
            else if (percent >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }
        return grade;
    }

    // Method 4: Display scorecard
    static void displayScorecard(int[][] pcm, double[][] result, char[] grade) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAvg\tPercent\tGrade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < pcm.length; i++) {
           System.out.println((i + 1) + "\t\t" +
				pcm[i][0] + "\t\t" +
				pcm[i][1] + "\t\t" +
				pcm[i][2] + "\t\t" +
				(int) result[i][0] + "\t\t" +
				result[i][1] + "\t\t" +
				result[i][2] + "\t\t" +
				grade[i]
			);
        System.out.println("--------------------------------------------------------------------------------");
    }
}

    public static void main(String[] args) {
        int numberOfStudents = 5;

        int[][] pcmScores = generatePCMScores(numberOfStudents);
        double[][] results = calculateResults(pcmScores);
        char[] grades = calculateGrade(results);

        displayScorecard(pcmScores, results, grades);
    }
}
