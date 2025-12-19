//Finding gratest Factor
import java.util.Scanner;
class GratestFactor{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//finding gratest Factor
		if(number>0){
			int gratestFactor=1;
			for(int i=number-1;i>=1;i--){
				if(number%i == 0){
					gratestFactor=i;
					break;
				}
			}
			
			//printing the gratest factor
			System.out.println("Gratest Factor Of given Number is: "+gratestFactor);
		}else{
			System.out.println("Not A Positive Number");
		}
		
		//closing the Scanner
		input.close();
	}
}