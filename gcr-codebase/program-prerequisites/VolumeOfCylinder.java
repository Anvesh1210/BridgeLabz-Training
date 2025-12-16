import java.util.*;
class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter radius of Cylinder: ");
		double radius = kb.nextDouble();
		System.out.print("Enter height of Cylinder: ");
		double height = kb.nextDouble();
		double area = Math.PI * Math.pow(radius,2)*height;
		System.out.println(area);
	}
} 