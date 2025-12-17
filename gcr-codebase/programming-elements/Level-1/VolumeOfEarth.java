//Finding Volume of Earth
public class VolumeOfEarth
{
	public static void main(String[] args)
		{

		//Giving input 
		double radiusInKm = 6378;
		double radiusInMiles = 6378/1.6;

		//Calculating Volue of the Earth
		double volumeInKm = (4/3.0)*Math.PI*Math.pow(radiusInKm,3);
		double volumeInMiles = (4/3.0)*Math.PI*Math.pow(radiusInMiles,3);

		//Displying Volume of The Earth
		System.out.println("The volume of earth in cubic kilometers is "+volumeInKm+" and cubic miles is "+volumeInMiles);
	}
}
