// Create a class SumOfNaturalNumbersUsingForLoop to calculate the sum of n natural numbers
// importing Scanner class for taking input
import java.util.Scanner;

public class SumOfNaturalNumbersUsingForLoop {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.println("Enter a number:");
        int n = input.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number (positive integer).");
        } else {
            // Compute the sum using the formula
            int sumUsingFormula = (n * (n + 1)) / 2;

            // Compute the sum using a for loop
            int sumUsingLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumUsingLoop += i;
            }

            // Compare and print the results
            System.out.println("Sum of first " + n + " natural numbers using formula: " + sumUsingFormula);
            System.out.println("Sum of first " + n + " natural numbers using for loop: " + sumUsingLoop);

            if (sumUsingFormula == sumUsingLoop) {
                System.out.println("Both results match.");
            } else {
                System.out.println("Results do not match. Check the implementation.");
            }
        }

      
    }
}
