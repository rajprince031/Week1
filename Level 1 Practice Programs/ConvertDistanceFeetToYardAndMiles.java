// Creating a class named ConvertDistanceFeetToYardAndMiles to convert distance in feet to yards and miles
import java.util.Scanner;

class ConvertDistanceFeetToYardAndMiles {
    public static void main(String[] args) {
        
        // Create a double variable to store the distance in feet
        double distanceInFeet;
        
        // Create double variables to store the converted distance in yards and miles
        double distanceInYards, distanceInMiles;
        
        // Create a Scanner object to take user input from Standard Input (keyboard)
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        
        // Take input from the user and store it in distanceInFeet
        distanceInFeet = input.nextDouble();
        
        // Convert the distance from feet to yards (1 yard = 3 feet)
        distanceInYards = distanceInFeet / 3;
        
        // Convert the distance from feet to miles (1 mile = 1760 yards)
        distanceInMiles = distanceInYards / 1760;
        
        // Print the distanceInMiles and distanceInYards
        System.out.println("The distance of " + distanceInFeet + " feet is equal to " + distanceInYards + " yards or " + distanceInMiles + " miles.");
    }
}
