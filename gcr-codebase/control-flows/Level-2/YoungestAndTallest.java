//Finding youngest and tallest amoungest three friends
import java.util.Scanner;
public class YoungestAndTallest{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking ages ages and Heights of three friends
		System.out.print("Input age of Amar: ");
		int amarAge = input.nextInt();
		System.out.print("Input age of Akbar: ");
		int akbarAge = input.nextInt();
		System.out.print("Input age of Anthony: ");
		int anthonyAge = input.nextInt();
		
		System.out.print("Input height of Amar: ");
		int amarHeight = input.nextInt();
		System.out.print("Input height of Akbar: ");
		int akbarHeight = input.nextInt();
		System.out.print("Input height of Anthony: ");
		int anthonyHeight = input.nextInt();
		
		//Finding the youngest friend and printing it
		if(amarAge<akbarAge && amarAge < anthonyAge){
			System.out.println("Amar is the Youngest friend");
		}else if(akbarAge<amarAge && akbarAge < anthonyAge){
			System.out.println("Akbar is the Youngest friend");
		}else{
			System.out.println("Antony is the Youngest friend");
		}
		
		//Finding the tallest friend and printing it
		if(amarHeight>akbarHeight && amarHeight > anthonyHeight){
			System.out.println("Amar is the Tallest friend");
		}else if(akbarHeight>amarHeight && akbarHeight > anthonyHeight){
			System.out.println("Anthony is the Tallest friend");
		}else{
			System.out.println("Antony is the Tallest friend");
		}
		
		
		//closing the Scanner
		input.close();
	}
}
		