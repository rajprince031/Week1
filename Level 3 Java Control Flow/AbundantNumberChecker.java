// Import Scanner to read user input
import java.util.Scanner;

// Create AbundantNumberChecker class to check if a number is abundant
public class AbundantNumberChecker {
    public static void main(String[] args){
        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask user to enter a number to check if it's an abundant number
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number entered by the user

        // Create a variable to store the sum of divisors
        int sum = 0; // Initialize sum to 0

        // Run a for loop to find divisors of the number
        for (int i = 1; i < number; i++) { // Loop from 1 to number - 1
            // Check if 'i' is a divisor of 'number'
            if (number % i == 0) { // If 'i' divides 'number' perfectly
                sum += i; // Add 'i' to the sum of divisors
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            // If sum is greater than number, it is an abundant number
            System.out.println("Abundant Number");
        } else {
            // If sum is not greater than number, it's not an abundant number
            System.out.println("Not an Abundant Number");
        }
    }
}
