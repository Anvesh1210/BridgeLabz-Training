//Finding the BMI of multiple person
import java.util.Scanner;
public class BMICalculations{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//taking number of persons
		System.out.print("Enter number of persons: ");
		int number = input.nextInt();
		
		//Taking height and weight from user
		double [] weight=new double[number];
		double [] height= new double[number];
		
		for(int i=0;i<number;i++){
			System.out.print("Enter person "+(i+1)+" Weight: ");
			weight[i] = input.nextDouble();
		}
		
		for(int i=0;i<number;i++){
			System.out.print("Enter person "+(i+1)+" height: ");
			height[i]   = input.nextDouble();
		}
		
		for(int i=0;i<number;i++){
			//converting height into meters
			double heightInMeter = height[i]/100;
			//calculating the BMI value of the person
			double bmi = weight[i]/(heightInMeter*heightInMeter);
			
			//priting the status of person according to BMI using if-else
			if(bmi>=40.0){
				System.out.println("The person with height "+height[i]+" cm and wight "+weight[i]+" kg has BMI "+bmi+ " and status is Obese");
			}else if(bmi>=25.0&& bmi<=39.9){
				System.out.println("The person with height "+height[i]+" cm and wight "+weight[i]+" kg has BMI "+bmi+ " and status is Overweight");
			}else if(bmi>=18.5&& bmi<=24.9){
				System.out.println("The person with height "+height[i]+" cm and wight "+weight[i]+" kg has BMI"+bmi+ " and status is Normal");
			}else if(bmi>=18.4){
				System.out.println("The person with height "+height[i]+" cm and wight "+weight[i]+" kg has BMI"+bmi+ " and status is Underweight");
			}
		
		}
		
		//closing the Scanner
		input.close();
	}
}
		