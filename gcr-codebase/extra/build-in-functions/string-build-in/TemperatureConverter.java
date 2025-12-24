//program that converts temperatures between Fahrenheit and Celsius.
import java.util.Scanner;
public class TemperatureConverter{
	//method that convert Fahrenheit to Celsius
	public static double fahrenheitToCelsius(double fahrenheit){
		double celsius = (fahrenheit-32)*5/9.0;
		return celsius;
	}
	
	//method that convert Celsius to Fahrenheit
	public static double celsiusToFahrenheit(double celsius){
		fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
		return fahrenheit;
	}
	
	public static void main(String []args){
		//Creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//taking two temperatures from user
		System.our.print("Enter celsius: ");
		double celsius = input.nextDouble();
		System.our.print("Enter celsius: ");
		double fahrenheit = input.nextDouble();
		
		//calling the methods to convert temperatures
		double convertedFahrenheit = celsiusToFahrenheit(celsius);
		double convertedCelsius = fahrenheitToCelsius(fahrenheit);
		
		//printing the results
		System.out.println("The celsius temperature "+celsius+"in fahrenheit is "+convertedFahrenheit);
		System.out.println("The fahrenheit temperature "+fahrenheit+"in celsius is "+convertedCelsius);
		
		//closing thr scanner
		input.close();
	}
}