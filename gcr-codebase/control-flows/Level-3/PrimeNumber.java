//Cheking the given number is prime or not
import java.util.Scanner;
public class PrimeNumber{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from user
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		
		//checking the number is prime or not
		boolean isPrime = true;
		for(int i=2;i<number;i++){
			if(number%i==0){
				isPrime=false;
				break;
			}
		}
		
		//priting that it is prime number or not
		if(isPrime){
			System.out.println("Given number is a prime number");
		}else{
			System.out.println("Given number is not a prime number");
		}
		
		//closing the Scanner
		input.close();
	}
}
		