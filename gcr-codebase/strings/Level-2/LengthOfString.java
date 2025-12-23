//finding length of string using build in method and user define method
import java.util.Scanner;
public class LengthOfString{
	
	//method to find string length using charAt() method
	public static int getStringLength(String s){
		int count =0;
		try{
			while(true){
				s.charAt(count);
				count++;
			}
		}catch(StringIndexOutOfBoundsException ex){
			
		}
		return count;
	}
	
	public static void main(String [] args){
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking a string from the user
		System.out.print("Enter a String: ");
		String s = input.nextLine();
		
		//calling build in method and user define method to get lowercase string
		int customLength = getStringLength(s);
        int builtInLength = s.length();

        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);
		
		//closing the scanner
		input.close();
	}
}