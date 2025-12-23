//get two substrings using charAt() and substring() method and compare them
import java.util.Scanner;
public class CompareSubstrings{
	
	//method to get substring using charAt()
	public static String getSubstringUsingCharAT(String s, int start, int end){
		String sub="";
		for(int i=start;i<end; i++){
			sub+=(s.charAt(i));
		}
		return sub;
	}
	
	
	
	public static void main(String [] args){
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking a string and starting index and ending index form the user
		System.out.print("Enter a string: ");
		String s = input.next();
		System.out.print("Enter Start index: ");
		int start = input.nextInt();
		System.out.print("Enter end index: ");
		int end = input.nextInt();
		
		//calling the method to get the subString
		String sub1 = getSubstringUsingCharAT(s, start, end);
		String sub2 = s.substring(start,end);
		
		//comparing both subStrings
		if(sub1.equals(sub2)){
			System.out.println("Both substrings are same and it is : " +sub1);
		}else{
			System.out.println("Both subString are not same");
			System.out.println("substring using charAt(): "+sub1);
			System.out.println("subString using substring: "+sub2);
		}
		
		
		
		//closing the scanner
		input.close();
	}
}