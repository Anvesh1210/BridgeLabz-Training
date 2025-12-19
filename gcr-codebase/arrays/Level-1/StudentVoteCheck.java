//Checking that a student can vote or not
import java.util.Scanner;
public class StudentVoteCheck{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		// Taking 10 student ages in an array 
		int []ages = new int[10];
		System.out.println("Enter Student ages");
		for(int i=0;i<ages.length;i++){
			ages[i] = input.nextInt();
		}
		
		//checking wether student can vote or not
		for(int i=0;i<ages.length;i++){
			if(ages[i]<1){
				System.out.println("invalid age");
			}else if(ages[i]>=18){
				System.out.println("The student with the age "+ages[i]+" can vote");
			}else{
				System.out.println("The student with the age "+ages[i]+" cannot vote");
			}
		}
		
		//Closing the Scanner 
		input.close();
	}
}
			