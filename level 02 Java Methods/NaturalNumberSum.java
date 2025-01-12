// Import Scanner to read user input
import java.util.Scanner;

// Create NaturalNumberSum class to calculate the sum of natural numbers
public class NaturalNumberSum {

    // Method to find the sum of n natural numbers using recursion
    public int recursiveSum(int n) {
        if (n == 1) {
            return 1; // Base case: if n is 1, return 1
        }
        return n + recursiveSum(n - 1); // Recursive case
    }

    // Method to find the sum of n natural numbers using the formula
    public int formulaSum(int n) {
        return n * (n + 1) / 2; // Use the formula n * (n + 1) / 2
    }

    public static void main(String[] args) {

        // Create an object of NaturalNumberSum class
        NaturalNumberSum naturalNumberSum = new NaturalNumberSum();

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt(); // Read the number entered by the user

        // Check if the entered number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            return; // Exit the program if input is not a natural number
        }

        // Calculate the sum using recursion
        int recursiveResult = naturalNumberSum.recursiveSum(n);

        // Calculate the sum using the formula
        int formulaResult = naturalNumberSum.formulaSum(n);

        // Compare the results and print the outputs
        System.out.println("Sum calculated using recursion: " + recursiveResult);
        System.out.println("Sum calculated using formula: " + formulaResult);

        // Verify if both results are the same
        if (recursiveResult == formulaResult) {
            System.out.println("Both results match! The calculations are correct.");
        } else {
            System.out.println("The results do not match. Please check the calculations.");
        }
    }
}
