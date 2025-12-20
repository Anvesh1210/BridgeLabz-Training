//Reverse of a number using Array
import java.util.Scanner;
public class ReverseNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//inputing a number from user
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		//storing the digits in Array
		int [] digit = new int[10];
		int index=0;
		while(number>0){
			digit[index] = number%10;
			number = number/10;
			index++;
		}
		
		//printing the array
		System.out.print("Reversed number: ");
		for(int i=0;i<index;i++){
			System.out.print(digit[i]);
		}
		
		//closing the scanner
		input.close();
	}
}