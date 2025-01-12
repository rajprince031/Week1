// Create a UnitConvertor2 utility class that help to convert one unit to another
public class UnitConvertor2 {

    //this method is used to convert yards to feet
    public static double YardsTofeet(double yards) {
        return (yards * 3);
    }

    //this method is used to convert feet to yards
    public static double feetToYards(double feet) {
        return (feet * 0.333333);
    }

    //this method is used to convert meters to inches
    public static double metersToInches(double meters) {
        return meters * 39.3701;
    }

    //this method is used to convert inches to meters
    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

    //this method is used to convert inches to centimeters
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

}
