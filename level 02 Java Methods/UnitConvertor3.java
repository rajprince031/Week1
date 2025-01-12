// Create a UnitConvertor3 utility class that help to convert one unit to another
public class UnitConvertor3 {

    //this method is used to convert kiolometers to miles
    public static double kilometersToMiles(double kiolometers) {
        return (kiolometers * 0.621371);
    }

    //this method is used to convert miles to kiolometers
    public static double MilesTokilometers(double miles) {
        return (miles * 1.60934);
    }

    //this method is used to convert meters to feet
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    //this method is used to convert inches to meters
    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

    //this method is used to convert feet to meters
    public static double inchesToCentimeters(double feet) {
        return feet * 2.54; 
    }

}
