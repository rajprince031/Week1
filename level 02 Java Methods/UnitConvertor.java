// Create a UnitConvertor utility class that help to convert one unit to another
public class UnitConvertor {

    //this method is used to convert tmeperature the Farhenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    //this method is used to convert tmeperature the Celsius to Farhenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    //this method is used to convert pounds to Kilogram
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    //this method is used to convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    //this method is used to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    //this method is used to convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
}
