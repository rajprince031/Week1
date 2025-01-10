// Create a class FizzBuzzWhile to implement the FizzBuzz logic using while loop
// Importing Scanner class for taking input
import java.util.Scanner;

public class FizzBuzzWhile {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.println("Enter a positive integer:");
        int n = input.nextInt();

        // Check if the number is a positive integer
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1; // Initialize the counter

            // Use a while loop to iterate from 1 to n
            while (i <= n) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if not divisible by 3 or 5
                else {
                    System.out.println(i);
                }
                i++; // Increment the counter
            }
        }

       
    }
}
