// Create AthleteRun class to calculate the number of rounds based on the triangle's perimeter
import java.util.Scanner;

class AthleteRun {
    public static void main(String[] args) {
        
        // Declare variables to store the sides of the triangle and other calculations
        double side1, side2, side3, perimeter, totalDistance, rounds;
        
        // Total distance the athlete needs to run in meters (5 km = 5000 meters)
        totalDistance = 5000;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to input the sides of the triangle in meters
        System.out.print("Enter the length of side 1 (in meters): ");
        side1 = input.nextDouble();
        
        System.out.print("Enter the length of side 2 (in meters): ");
        side2 = input.nextDouble();
        
        System.out.print("Enter the length of side 3 (in meters): ");
        side3 = input.nextDouble();
        
        // Calculate the perimeter of the triangle (sum of all three sides)
        perimeter = side1 + side2 + side3;
        
        // Calculate the number of rounds needed to complete 5 km
        rounds = totalDistance / perimeter;
        
        // Round up the number of rounds to the nearest whole number
        rounds = Math.ceil(rounds);
        
        // Display the total number of rounds the athlete must run to complete 5 km
        System.out.println("The total number of rounds the athlete will run is: " + (int)rounds);
    }
}
