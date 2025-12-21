//Utility class for unit conversion
public class UnitConvertor {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;  
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;  
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;  
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;  
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;  
    }

    public static void main(String[] args) {
        //initilizing variables to pass in the methods
		double yards = 3;
		double feet2yards = 0.333333;
		double meters = 1;
		double inches = 10;
		double inches2cm = 10;
		
		//Calling the methods convertYardsToFeet, convertFeetToYards, convertMetersToInches, convertInchesToMeters, convertInchesToCentimeters
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");

        double yardsFromFeet = convertFeetToYards(feet2yards);
        System.out.println(feet2yards + " feet is equal to " + yardsFromFeet + " yards.");
        
        double inchesFromMeters = convertMetersToInches(meters);
        System.out.println(meters + " meter is equal to " + inchesFromMeters + " inches.");
        
        double metersFromInches = convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + metersFromInches + " meters.");
        
        double centimeters = convertInchesToCentimeters(inches2cm);
        System.out.println(inches2cm + " inches is equal to " + centimeters + " centimeters.");
    }
}
