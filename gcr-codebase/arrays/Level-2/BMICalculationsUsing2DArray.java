// Finding BMI using Multi-Dimensional Array
import java.util.Scanner;

public class BMICalculationsUsing2DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Take input for weight and height with validation
        for (int i = 0; i < number; i++) {

            while (true) {
                System.out.print("Enter person " + (i + 1) + " weight : ");
                double weight = input.nextDouble();
                if (weight > 0) {
                    personData[i][0] = weight;
                    break;
                }
                System.out.println("Invalid weight Enter positive value.");
            }

            while (true) {
                System.out.print("Enter person " + (i + 1) + " height (cm): ");
                double height = input.nextDouble();
                if (height > 0) {
                    personData[i][1] = height;
                    break;
                }
                System.out.println("Invalid height enter positive value.");
            }
        }

        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {

            double heightInMeter = personData[i][1] / 100;
            double bmi = personData[i][0] / (heightInMeter * heightInMeter);
            personData[i][2] = bmi;

            if (bmi >= 40.0) {
                weightStatus[i] = "Obese";
            } else if (bmi >= 25.0) {
                weightStatus[i] = "Overweight";
            } else if (bmi >= 18.5) {
                weightStatus[i] = "Normal";
            } else {
                weightStatus[i] = "Underweight";
            }
        }

        // Display result
        System.out.println("\n===== BMI REPORT =====");
        for (int i = 0; i < number; i++) {
            System.out.println(
                "Person " + (i + 1) +" Height: " + personData[i][1] + " cm" +" Weight: " + personData[i][0] + " kg" +" BMI: " + personData[i][2] +" Status: " + weightStatus[i]);
        }

		//closing the Scanner
        input.close();
    }
}
