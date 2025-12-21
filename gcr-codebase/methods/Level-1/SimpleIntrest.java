//calculating Simple Interest using methods
import java.util.Scanner;
public class SimpleIntrest{

	//method for calculating simpleIntrest Intrest
	public double calculateSimpleIntrest(double principal, double rate, double time){
		double simpleIntrest = (principal*rate*time)/100.0;
		return simpleIntrest;
	}
	
	
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//taking principal,rate, and time from user
		System.out.print("Enter Principle amount: ");
		double principal = input.nextDouble();
		
		System.out.print("Enter Rate: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter Time: ");
		double time = input.nextDouble();
		
		//calling the method calculateSimpleIntrest
		SimpleIntrest si = new SimpleIntrest();
		double simpleIntrest = si.calculateSimpleIntrest(principal,rate,time);
		
		//printing the simple intrest of given data
		System.out.println("The Simple Interest is "+simpleIntrest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
		
		//closing the scanner
		input.close();
	}
}
