//Sandeep’s Fitness Challenge Tracker
import java.util.Scanner;
public class FitnessTracker{
	public static void main(String []args){
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n============================================");
		System.out.println("---Welcome to fitness tracker Application---");
		System.out.println("============================================");
		
		System.out.println("\nEnter your last 7 days push-ups count (Enter 0 for rest days)");
		System.out.println("-------------------------------------------------------------");
		
		int [] pushupsCount = new int[7];
		int total=0;
		int activeDays=0;
		
		//taking 7 days push-ups from the user
		for(int i=0;i<pushupsCount.length;i++){
			System.out.print("Enter number of push-ups for day "+(i+1)+": ");
			pushupsCount[i] =input.nextInt();
			
		}
		
		//calculating no of active days and total push-ups
		for(int count:pushupsCount){
			if(count <= 0){
				continue;
			}
			total+=count;
			activeDays++;
		}
		
		System.out.println("\n\n-------------------------------------------------------------");
		System.out.println("The total number of push-ups for last 7 days   : "+total);
		if(activeDays>0){
			System.out.println("The average push-ups for last 7 days           : "+(total/activeDays));
		}else{
			System.out.println("The average push-ups for last 7 days           : 0");
		}
		
		System.out.println("\nThankyou for using the Application");
		//closing the Scanner
		input.close();
	}
}
