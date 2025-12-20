//Finding youngest and tallest amoungest three friends
import java.util.Scanner;
public class YoungestAndTallestInThree{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking ages ages and Heights of three friends
		int [] age = new int[3];
		int [] height = new int[3];
		
		System.out.println("Enter Ages: ");
		for(int i=0;i<3;i++){
			age[i]=input.nextInt();
		}
		
		System.out.println("Enter Heights: ");
		for(int i=0;i<3;i++){
			height[i]=input.nextInt();
		}
		
		//Finding the youngest friend and printing it
		if(age[0]<age[1] && age[0] < age[2]){
			System.out.println("Amar is the Youngest friend");
		}else if(age[1]<age[0] && age[1] < age[2]){
			System.out.println("Akbar is the Youngest friend");
		}else{
			System.out.println("Antony is the Youngest friend");
		}
		
		//Finding the tallest friend and printing it
		if(height[0]>height[1] && height[0] > height[2]){
			System.out.println("Amar is the Tallest friend");
		}else if(height[1]>height[0] && height[1] > height[2]){
			System.out.println("Anthony is the Tallest friend");
		}else{
			System.out.println("Antony is the Tallest friend");
		}
		
		
		//closing the Scanner
		input.close();
	}
}
		