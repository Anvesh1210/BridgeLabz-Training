//get two substrings using charAt() and substring() method and compare them
import java.util.Scanner;
public class CompareCharacters{
	
	//method to get substring using charAt()
	public static char[] getCharArray(String s){
		char [] charArray = new char[s.length()];
		for(int i=0;i<s.length();i++){
			charArray[i] = s.charAt(i);
		}
		return charArray;
	}
	
	//method to return character array by toCharArray()
	public static char[] getCharArrayUsingtoCharArray(String s){
		return s.toCharArray();
	}
	
	//method to compare two strings
	public static boolean compareCharArray(char[] one, char[] two){
		if(one.length != two.length){
			return false;
		}
		for(int i=0; i<one.length; i++){
			if(one[i] != two[i]){
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String [] args){
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking a string and starting index and ending index form the user
		System.out.print("Enter a string: ");
		String s = input.next();    
		
		//calling the method to get the character array
		char [] charArray1 = getCharArray(s);
		char [] charArray2 = getCharArrayUsingtoCharArray(s);
		
		//calling method to compare both char array
		boolean flag = compareCharArray(charArray1,charArray2);
		
		//comparing both subStrings
		if(flag){
			System.out.println("Both character Arrays are same" );
		}else{
			System.out.println("Both character Arrays are not same");
			
		}
		
		
		
		//closing the scanner
		input.close();
	}
}