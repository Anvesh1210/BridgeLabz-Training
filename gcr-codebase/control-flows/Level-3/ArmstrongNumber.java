//Cheking the given number is Armstrong or not
import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from user
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		
		//checking the number is Armstrong or not
		double sumOfCube=0;
		int temp=number;
		while(temp!=0){
			int n = temp%10;
			sumOfCube=sumOfCube+Math.pow(n,3);
			temp/=10;
		}
		
		//priting that it is Armstrong number or not
		if(sumOfCube==number){
			System.out.println("Given number is a Armstrong number");
		}else{
			System.out.println("Given number is not a Armstrong number");
		}
		
		//closing the Scanner
		input.close();
	}
}
		