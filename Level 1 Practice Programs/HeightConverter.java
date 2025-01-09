// Creating Class with name HeightConverter to Convert the height feet into inches and cm.
import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {
        
        // Create a double variable heightInCm to store the height in centimeters
        double heightInCm;
        
        // Create a double variable heightInInches to store the height in inches
        double heightInInches;
        
        // Create an integer variable feet to store the height in feet
        int feet;
        
        // Create a double variable inches to store the remaining inches after converting feet
        double inches;
        
        // Create a Scanner object to take user input from Standard Input (keyboard)
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        
        // Take input from the user and store it in heightCm
        heightInCm = input.nextDouble();
        
        // Convert height from centimeters to inches using the formula: 1 inch = 2.54 cm
        heightInInches = heightInCm / 2.54;
        
        // Convert height from inches to feet using the formula: 1 foot = 12 inches
        feet = (int) heightInInches / 12; 

        // Calculate the remaining inches after converting to feet
        inches = heightInInches % 12;

        // Display the height in cm, feet, and inches
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
