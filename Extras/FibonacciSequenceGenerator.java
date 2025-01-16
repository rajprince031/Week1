import java.util.Scanner;
//Creating the class
public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user for the number of terms
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int terms = input.nextInt();

        // Calling the method to generate and print the Fibonacci sequence
        generateFibonacci(terms);
    }

    // Method to generate and print the Fibonacci sequence up to the specified number of terms
    public static void generateFibonacci(int terms) {
        // Handle edge cases
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // First two terms of the Fibonacci sequence
        int first = 0, second = 1;

        // Print the first term if it's part of the sequence
        if (terms >= 1) {
            System.out.print(first);
        }

        // Print the second term if it's part of the sequence
        if (terms >= 2) {
            System.out.print(" " + second);
        }

        // Generate and print the remaining terms in the Fibonacci sequence
        for (int i = 3; i <= terms; i++) {
            int nextTerm = first + second;
            System.out.print(" " + nextTerm);
            first = second;
            second = nextTerm;
        }

        System.out.println(); // To move to a new line after printing the sequence
    }
}
