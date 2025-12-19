//Finding All multiples Of a number using while Loop
import java.util.Scanner;
class MultiplesOfNumberUsingWhile{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//finding All multiples and printing it
		if(number>0 && number<100){
			System.out.println("Multiples of given number is: ");
			int i=number;
			while(i>=1){
				if(number%i == 0){
					System.out.println(i);
				}
				i--;
			}
		}else{
			System.out.println("Not A Positive Number or grater then 100");
		}
		
		//closing the Scanner
		input.close();
	}
}