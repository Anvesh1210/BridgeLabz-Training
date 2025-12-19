//Finding the BMI of a person
import java.util.Scanner;
public class BMICalculation{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from user
		System.out.print("Enter person Weight: ");
		double weight = input.nextDouble();
		System.out.print("Enter person height: ");
		double heightInCm = input.nextDouble();
		
		//converting height into meters
		double heightInMeter = heightInCm/100;
		//calculating the BMI value of the person
		double bmi = weight/(heightInMeter*heightInMeter);
		
		//priting the status of person according to BMI using if-else
		if(bmi>=40.0){
			System.out.println("person BMI is "+bmi+ " and status is Obese");
		}else if(bmi>=25.0&& bmi<=39.9){
			System.out.println("person BMI is "+bmi+ " and status is Overweight");
		}else if(bmi>=18.5&& bmi<=24.9){
			System.out.println("person BMI is "+bmi+ " and status is Normal");
		}else if(bmi>=18.4){
			System.out.println("person BMI is "+bmi+ " and status is Underweight");
		}
		
		//closing the Scanner
		input.close();
	}
}
		