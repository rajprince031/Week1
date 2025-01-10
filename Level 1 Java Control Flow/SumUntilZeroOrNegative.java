// create SumUntilZeroOrNegative class to calculate the sum of numbers until the user enters 0 or a negative number

// Import the Scanner class for taking user input
import java.util.Scanner;

class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        
        // Declare a variable 'total' to store the running sum of the numbers.
        // Initialize it to 0.0 since the sum starts from zero.
        double total = 0.0;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Declare a variable to store the user's entered number.
        double number;
        
        // Using an infinite loop (while(true)) to repeatedly ask the user for input
        while (true) {
            // Ask the user to input a number
            System.out.print("Enter a number (or enter 0 or a negative number to stop): ");
            number = input.nextDouble();
            
            // If the entered number is 0 or negative, break the loop and stop the input process
            if (number <= 0) {
                break;
            }
            
            // Add the entered number to the total sum
            total += number;
        }
        
        // After the loop ends, print the total sum of the numbers entered
        System.out.println("The total sum is: " + total);
    }
}
