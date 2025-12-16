import java.util.*;
class AreaOfCircle{
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter redius: ");
		double radius = kb.nextDouble();
		double area = Math.PI * Math.pow(radius,2);
		System.out.println("Area: "+area);
	}
} 