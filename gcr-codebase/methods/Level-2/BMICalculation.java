import java.util.Scanner;

public class BMICalculation{

    // Method to calculate BMI and store it in the 3rd column
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeter = heightInCm / 100;

            double bmi = weight/(heightInMeter*heightInMeter);
            data[i][2] = bmi;
        }
    }

    // Method to determine BMI status for all persons
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi=data[i][2];
            if (bmi >= 40.0){
                status[i]="Obese";
            }else if (bmi>=25.0) {
               status[i]="Overweight";
            }else if (bmi>=18.5) {
                status[i]="Normal";
            }else {
                status[i]="Underweight";
            }
        }
        return status;
    }

    public static void main(String[] args){
		//creating scanner object
        Scanner input = new Scanner(System.in);

		//array for storing data
        double[][] persons = new double[10][3];

        // Taking input
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Enter details for Person " + (i+1));
            System.out.print("Weight: ");
            persons[i][0] = input.nextDouble();
            System.out.print("Height: ");
            persons[i][1] = input.nextDouble();
        }

        // Calculate BMI and Get BMI Status
        calculateBMI(persons);
        String[] status = getBMIStatus(persons);

        // Display output
		for (int i=0; i<persons.length;i++) {
				System.out.println("Person "+(i+1) + " Weight " +persons[i][0] + " Height " +persons[i][1] + "  BMI  " +persons[i][2] + " Status " +status[i]);
		}

		//closing the scanner
        input.close();
    }
}
