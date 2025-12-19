//check if the first, second, or third number is the largest of the three.
import java.util.*;
public class LargestAmongThree{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking three numbers form the user
		System.out.print("Enter First Number:");
		int number1 = input.nextInt();
		System.out.print("Enter second Number:");
		int number2 = input.nextInt();
		System.out.print("Enter Third Number:");
		int number3 = input.nextInt();
		
		//checking the first number is smallest or not and printing it
		if(number1>number2 && number1>number3){
			System.out.println("Is the first number the Largest? Yes");
		}else{
			System.out.println("Is the first number the Largest? No");
		}
		
		if(number2>number1 && number2>number3){
			System.out.println("Is the second number the Largest? Yes");
		}else{
			System.out.println("Is the second number the Largest? No");
		}
		
		if(number3>number1 && number3>number2){
			System.out.println("Is the second number the Largest? Yes");
		}else{
			System.out.println("Is the second number the Largest? No");
		}
		
		//closing the Scanner 
		input.close();
	}
}
