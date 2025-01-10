// Import Scanner class for taking user inputs  
import java.util.Scanner;

// Create SumUntilZero class to calculate the sum of numbers until the user enters 0
class SumUntilZero {
    public static void main(String[] args) {
        
        // Declare a variable 'total' of type double to store the sum of numbers
        double total = 0.0;
        
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable to store the user's entered number
        double number;
        
        // Use a while loop to keep asking for numbers until the user enters 0
        while (true) {
            // Ask the user to input a number
            System.out.print("Enter a number (or enter 0 to stop): ");
            number = input.nextDouble();
            
            // If the number is 0, break out of the loop
            if (number == 0) {
                break;
            }
            
            // Add the entered number to the total
            total += number;
        }
        
        // Print the total sum after the loop end
        System.out.println("The total sum is: " + total);
    }
}
