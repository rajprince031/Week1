// Create a DistanceConverter class to convert the distance kilometers to miles.

import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {
     
        // Create a double variable km to store the distance in kilometers
        double km;
        
        // Create a Scanner object to take user input from Standard Input (keyboard)
        Scanner input = new Scanner(System.in);
     
        // Ask the user to input the distance in kilometers.
        System.out.print("Enter distance in kilometers ");
        
        // Take input from the user and store it in km
        km = input.nextDouble();
        
        // Create a double variable miles to Convert kilometers to miles using the formula: 1 mile = 1.6 km
        double miles = km / 1.6;
        
        // Display the miles
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");


    }
}