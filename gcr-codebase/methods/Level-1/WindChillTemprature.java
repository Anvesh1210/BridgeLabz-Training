//finding quotient and reminder of two numbers
import java.util.Scanner;
public class WindChillTemprature{

	//method for calculating wind Chill
	public double calculateWindChill(double temperature, double windSpeed){
		double windChill = 35.74 + (0.6215*temperature) + ((0.4275*temperature) - 35.75) * Math.pow(windSpeed,0.16);
		
		return windChill;
	}
	
	
	public static void main(String []args){
	
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//taking tempracture  and Wind Speed
		System.out.print("Enter Temprature: ");
		double temperature = input.nextInt();
		
		System.out.print("Enter Wind Speed: ");
		double windSpeed = input.nextInt();
		
		
		//creating object of WindChillTemprature and Calling calculateWindChill method
		WindChillTemprature windChillTemprature = new WindChillTemprature();
		double windChill = windChillTemprature.calculateWindChill(temperature, windSpeed);
		
		//printing the smallest and largest number
		System.out.println("The wind chill Temprature: "+windChill);
		
		//closing the scanner
		input.close();
	}
}
