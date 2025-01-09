// Create TravelDetails class to gather and display the travel information
import java.util.Scanner;

class TravelDetails {
    public static void main(String[] args) {
        
        // Create variables to store user inputs for travel details
        String name, fromCity, viaCity, toCity;
        double fromToVia, viaToFinalCity, totalDistance;
        double timeTaken, averageSpeed;

        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking user inputs for the name and cities
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.print("Enter the starting city (from): ");
        fromCity = input.nextLine();
        
        System.out.print("Enter the via city: ");
        viaCity = input.nextLine();
        
        System.out.print("Enter the destination city (to): ");
        toCity = input.nextLine();
        
        // Taking user inputs for distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        fromToVia = input.nextDouble();
        
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        viaToFinalCity = input.nextDouble();
        
        // Taking user input for time taken (in hours)
        System.out.print("Enter the time taken (in hours): ");
        timeTaken = input.nextDouble();
        
        // Calculate the total distance and average speed
        totalDistance = fromToVia + viaToFinalCity;
        averageSpeed = totalDistance / timeTaken;
        
        // Print the result
        System.out.println("\nTravel Details:");
        System.out.println("Name: " + name);
        System.out.println("Starting City: " + fromCity);
        System.out.println("Via City: " + viaCity);
        System.out.println("Destination City: " + toCity);
        System.out.println("Distance from " + fromCity + " to " + viaCity + ": " + fromToVia + " miles");
        System.out.println("Distance from " + viaCity + " to " + toCity + ": " + viaToFinalCity + " miles");
        System.out.println("Total Distance Traveled: " + totalDistance + " miles");
        System.out.println("Time Taken: " + timeTaken + " hours");
        System.out.println("Average Speed: " + averageSpeed + " miles per hour");
    }
}
