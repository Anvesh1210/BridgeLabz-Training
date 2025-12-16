import java.util.*;
class PerimeterOfRectangle{
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter Length: ");
		int len=kb.nextInt();
		System.out.print("Enter Width: ");
		int wid=kb.nextInt();
		int perimeter = 2*(len+wid);
		System.out.println("Perimeter: "+perimeter);
		}
} 

		