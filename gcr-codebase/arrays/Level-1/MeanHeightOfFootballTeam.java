//Sum of numbers until enters 0 or negative number
import java.util.Scanner;
public class MeanHeightOfFootballTeam{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		double []heights = new double[11];
		double sumOfHeights=0.0;

		// taking heights from user and sum it
		System.out.println("Enter heights:");
		for(int i=0;i<heights.length;i++){
			heights[i] = input.nextInt();
			sumOfHeights+=heights[i];
			
		}
		
		System.out.println("The mean height of football team is : "+(sumOfHeights/11.0));
		
		//Closing the Scanner 
		input.close();
	}
}
			