// Import Scanner to read user input
import java.util.Scanner;

// Create HarshadNumberChecker class to check if a number is a Harshad number
public class HarshadNumberChecker {
    public static void main(String[] args){
        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask user to enter a number to check if it's a Harshad number
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number entered by the user

        // Create a variable to store the sum of digits
        int sum = 0; // Initialize sum to 0

        // Create a variable to store the original number for divisibility check
        int originalNumber = number;

        // Run a while loop to access each digit of the number
        while (number > 0) {
            // Extract the last digit of the number
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to sum
            number = number / 10; // Remove the last digit
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            // If the number is divisible by the sum of digits, it's a Harshad number
            System.out.println("Harshad Number");
        } else {
            // If the number is not divisible by the sum of digits, it's not a Harshad number
            System.out.println("Not a Harshad Number");
        }
    }
}
