// Create WeightConverter class to convert weight from pounds to kilograms
import java.util.Scanner;

class WeightConverter {
    public static void main(String[] args) {
        
        // Declare variables to store weight in pounds and kilograms
        double weightInPounds, weightInKg;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the weight in pounds
        System.out.print("Enter the weight in pounds: ");
        weightInPounds = input.nextDouble();
        
        // Convert the weight from pounds to kilograms (1 pound = 2.2 kg)
        weightInKg = weightInPounds * 2.2;
        
        // Print the results
        System.out.println("The weight of the person in pounds is: " + weightInPounds + " and in kilograms is: " + weightInKg);
    }
}
