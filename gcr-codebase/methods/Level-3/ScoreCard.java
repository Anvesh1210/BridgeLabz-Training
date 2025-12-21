import java.util.Scanner;

public class ScoreCard {

    // Method to generate random PCM scores
    static int[][] generateScores(int students) {
        int[][] scores = new int[students][3]; 

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10; 
            scores[i][1] = (int)(Math.random() * 90) + 10; 
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }

    // Method to calculate total, average and percentage
    static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3]; 

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            // Round to 2 decimal places
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }

    // Method to display scorecard
    static void displayScoreCard(int[][] scores, double[][] result) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAverage\tPercentage");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +scores[i][0] + "\t" +scores[i][1] + "\t" +scores[i][2] + "\t" + result[i][0] + "\t" +result[i][1] + "\t" +result[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] result = calculateResults(scores);
        displayScoreCard(scores, result);

        sc.close();
    }
}
