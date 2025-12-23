//checking Voting Eligibility of students
import java.util.Scanner;
import java.util.Random;
public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
		Random ram = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = ram.nextInt(90) + 10; 
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            // Validate age
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking number of students from the user
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();   

        int[] ages = generateAges(n);
        String[][] votingResult = checkVotingEligibility(ages);
        displayResult(votingResult);
		
		//Closing the Scanner
        sc.close();
    }
}
