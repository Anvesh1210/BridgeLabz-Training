//check whether a person can vote, depending on whether his/her age
import java.util.Scanner;
public class VoteCheck{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking the user age
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		//checking and printing that the user can vote or not
		if( age>=18 ){
			System.out.println("The person's age is "+age+" and can vote.");
		}else{
			System.out.println("The person's age is "+age+" and cannot vote.");
		}
		
		//Closing the Scanner
		input.close();
	}
}
		