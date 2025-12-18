//Making Basic Calculator 
import java.util.Scanner;
public class BasicCalculator
{
	public static void main(String[] args)
	{
		
		//taking two number from the user
		Scanner input = new Scanner(System.in);
		float num1 = input.nextFloat();
		float num2 = input.nextFloat();
		
		//writing calculator opertions
		float addition = num1 + num2;
		float subtraction = num1 - num2;
		float multiplication  = num1 * num2;
		float division  = num1 / num2;

		//Displaying Addition, subtraction, multiplication, and division
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+addition+", "+subtraction+", "+multiplication+", and "+division+".");
	}
}
		
		 