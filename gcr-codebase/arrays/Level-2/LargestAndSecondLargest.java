// finding largest and second largest digit of a number
import java.util.Scanner;
public class LargestAndSecondLargest{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		
		//Taking a number from the user
		System.out.print("Enter a number: ");
		int number=input.nextInt();
		
		//finding the digits of the number and string in array;
		int []digits = new int[10];
		int index=0;
		
		for(int i=0;i<digits.length;i++){
			if(number == 0){
				break;
			}
			digits[i] = number%10;
			number = number/10;
			index++;
		}
		
		//finding largest and second largest digit
		int largest=0;
		int secondLargest=0;
		
		for(int i=0;i<index;i++){
			if(digits[i]>largest){
				secondLargest=largest;
				largest=digits[i];
			}else if(digits[i]>secondLargest && digits[i] != largest){
				secondLargest = digits[i];
			}
		}
		
		// Display result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
		
	}
}