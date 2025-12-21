//Unit Convertor class for multiple unit conversions
public class UnitConvertor2 {
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;  
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;  
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;  
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462; 
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;  
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172; 
    }

    public static void main(String[] args) {
        //initlizing variables to pass in the methods
		double fahrenheit = 98.6;
		double celsiusInput = 37;
		double pounds = 150;
		double kilogramsInput = 68;
		double gallons = 5;
		double litersInput = 10;
		
		//Calling methods convertFahrenheitToCelsius, convertCelsiusToFahrenheit, convertPoundsToKilograms, convertKilogramsToPounds, convertGallonsToLiters, convertLitersToGallons
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C.");
     
        double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsiusInput);
        System.out.println(celsiusInput + "°C is equal to " + fahrenheitFromCelsius + "°F.");
        
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
        
        double poundsFromKilograms = convertKilogramsToPounds(kilogramsInput);
        System.out.println(kilogramsInput + " kilograms is equal to " + poundsFromKilograms + " pounds.");
        
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");
        
        double gallonsFromLiters = convertLitersToGallons(litersInput);
        System.out.println(litersInput + " liters is equal to " + gallonsFromLiters + " gallons.");
    }
}
