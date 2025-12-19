//printing Odd Even Numbers
import java.util.Scanner;
public class FizzBuzzUsingWhile{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//checking number is fizz or buzz
		if(number>0){
			int i=1;
			while(i<=number){
				if(i%3==0 && i%5==0){
					System.out.println("FizzBuzz");
				}else if(i%3 == 0){
					System.out.println("Fizz");
				}else if(i%5 == 0){
					System.out.println("Buzz");
				}else{
					System.out.println(i);
				}
				i++;
			}
		}else{
			System.out.println("Not A Natutral Number");
		}
		//closing the Scanner
		input.close();
	}
}
		