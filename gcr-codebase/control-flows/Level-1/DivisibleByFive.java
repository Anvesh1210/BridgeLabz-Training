//check if a number is divisible by 5
import java.util.Scanner;
class DivisibleByFive{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//Checking number is divisible by five and printing it
		if(number%5 == 0){
			System.out.println("Is the number "+number+" divisible by 5? Yes");
		}else{
			System.out.println("Is the number "+number+" divisible by 5? NO");
		}
		
		//closing the Scanner
		input.close();
	}
}