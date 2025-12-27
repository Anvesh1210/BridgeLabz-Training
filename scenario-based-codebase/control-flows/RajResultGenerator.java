//result generator program
import java.util.Scanner;
public class RajResultGenerator{
    public static void main(String[] args){
		
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

        int subjects = 5;
        int total = 0;
        int[] marks = new int[subjects];

        // Input marks using for-loop
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate average
        double average = total / (double) subjects;
        System.out.println("\nAverage Marks: " + average);

        // Determine grade using switch
        char grade;
        switch ((int) average / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            case 5:
                grade = 'E';
                break;
            default:
                grade = 'F';
        }

		//printing the grade
        System.out.println("Grade: " + grade);
		
		//closing the Scanner
        sc.close();
    }
}
