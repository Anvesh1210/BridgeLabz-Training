import java.util.Scanner;
public class BMICalculator{
    // Method to Calculate BMI and Status
    public public static String[][] calculateBMI(double weight, double heightCm) {
        String[][] bmiData = new String[1][4];
        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        bmiData[0][0] = String.valueOf(heightCm);
        bmiData[0][1] = String.valueOf(weight);
        bmiData[0][2] = String.valueOf(bmi);
        bmiData[0][3] = status;

        return bmiData;
    }

    // Method to Process all members
    public static String[][] processBMI(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i=0; i<hw.length; i++) {
            String[][] temp = calculateBMI(hw[i][0], hw[i][1]);
            result[i] = temp[0];
        }
        return result;
    }

    // Method to Display BMI Table
    public static void displayBMI(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
		System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" +data[i][1] + "\t\t" +data[i][2] + "\t\t" +data[i][3]);
        }
        
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] heightWeight = new double[10][2];

        // Taking user input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight : ");
            heightWeight[i][0] = sc.nextDouble();
            System.out.print("Height : ");
            heightWeight[i][1] = sc.nextDouble();
            System.out.println();
        }

        String[][] bmiResult = processBMI(heightWeight);
        displayBMI(bmiResult);
		
		//closing the Scanner
        sc.close();
    }
}
