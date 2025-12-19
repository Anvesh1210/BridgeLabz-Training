//FizzBuzz Program
import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking rows and column
		System.out.print("Enter a Number: ");
		int number=input.nextInt();
		
		// checking for natural number
		if(number>0){
		
			//cheking for fizz and buzz and stroing in array
			String []array=new String[number];
			for(int i=1;i<=number;i++){
				if(i%3==0 && i%5==0){
					array[i-1] =  "FizzBuzz";
				}else if(i%3==0){
					array[i-1] = "Fizz";
				}else if(i%5==0){
					array[i-1] ="Buzz";
				}else{
					array[i-1]= i+"";
				}
			}
			
			//printing the array
			for(int i=0;i<array.length;i++){
				System.out.println("Position "+(i+1)+" = "+array[i]);
				
			}
			
		}else{
			System.out.println("Not a natural number");
		}
		
		//closing the scanner 
		input.close();
		
	}
}