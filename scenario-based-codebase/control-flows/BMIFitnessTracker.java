//program for BMI calculation
import java.util.Scanner;
public class BMIFitnessTracker {
    public static void main(String[] args) {
		
		//creating Scanner object
        Scanner scanner = new Scanner(System.in);

        // Input height in cm
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();

        // Input weight in kilograms
        System.out.print("Enter weight in kg: ");
        double weightKg = scanner.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display BMI category using corrected logic
        if (bmi >= 40.0) {
            System.out.println("Person BMI is " + bmi + " and status is Obese");
        } else if (bmi >= 25.0) {
            System.out.println("Person BMI is " + bmi + " and status is Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("Person BMI is " + bmi + " and status is Normal");
        } else {
            System.out.println("Person BMI is " + bmi + " and status is Underweight");
        }

		//closing Scanner object
        scanner.close();
    }
}
