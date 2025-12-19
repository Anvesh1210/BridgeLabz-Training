//Finding the factorial of an Integer
import java.util.Scanner;
public class FindFactorial{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//checking number is poitive or not
		if(number>0){
			//Calculating the Factorial
			int factorial=1;
			while(number>1){
				factorial*=number;
				number--;
			}
		
			//printing the Factorial
			System.out.print("Factorial of given number is: "+factorial);
		}else{
			System.out.print("Not a positive number");
		}
		
		//closing the Scanner
		input.close();
	}
}
		