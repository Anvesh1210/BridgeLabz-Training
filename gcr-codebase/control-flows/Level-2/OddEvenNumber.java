//printing Odd Even Numbers
import java.util.Scanner;
public class OddEvenNumber{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//checking number is poitive or not
		for(int i=1;i<=number;i++){
			if(i%2==0){
				System.out.println("Even Number: "+i);
			}else{
				System.out.println("Odd Number: "+i);
			}
		}
		//closing the Scanner
		input.close();
	}
}
		