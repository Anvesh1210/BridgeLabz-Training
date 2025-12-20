// Calculating Percentage and Grade for Multiple Students using 2D Array
import java.util.Scanner;
public class PercentageAndGradeUsing2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // 2D array to store marks
        int[][] marks = new int[n][3];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input marks with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            int p = input.nextInt();
            System.out.print("Chemistry: ");
            int c = input.nextInt();
            System.out.print("Maths: ");
            int m = input.nextInt();
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks! Enter positive values only.");
                i--; // re-enter marks
                continue;
            }

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Display result
        System.out.println("\nSTUDENT RESULT:  ");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +" Physics: " + marks[i][0] +" Chemistry: " + marks[i][1] +" Maths: " + marks[i][2] +" Percentage: " + percentage[i] +" Grade: " + grade[i]);
        }

        input.close();
    }
}
