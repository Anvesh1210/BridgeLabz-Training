// Calculating Percentage and Grade for Multiple Students
import java.util.Scanner;
public class PercentageAndGradeUsingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // Arrays to store marks persentage and grade
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
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
                i--; // decrement index to re-enter marks
                continue;
            }

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
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
            System.out.println(
                "Student " + (i + 1) +" Physics: " + physics[i] +" Chemistry: " + chemistry[i] +" Maths: " + maths[i] +" Percentage: " + percentage[i] +" Grade: " + grade[i]);
        }

        // Close scanner
        input.close();
    }
}
