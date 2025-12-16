import java.util.*;
class CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter Temperature in Celsius: ");
		double celsius = kb.nextDouble();
		double Fahrenheit = (celsius * 9.0/5.0) + 32;
		System.out.println("Tempreture in Fahrenheit: "+Fahrenheit);
	}
} 