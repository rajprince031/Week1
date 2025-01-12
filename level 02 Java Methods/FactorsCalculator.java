// Import Scanner to read user input
import java.util.Scanner;

// Create FactorsCalculator class to find factors and perform calculations
public class FactorsCalculator {

    // Method to find the factors of a number and return them in an array
    public static int[] findFactors(int number) {
        // Count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array with the count of factors
        int[] factors = new int[count];
        int index = 0;

        // Save the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of factors
    public static int findSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2); // Calculate square using Math.pow()
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number entered by the user

        // Ensure the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return; // Exit the program if input is invalid
        }

        // Find the factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate the sum of factors
        int sum = findSum(factors);
        System.out.println("Sum of factors: " + sum);

        // Calculate the product of factors
        long product = findProduct(factors);
        System.out.println("Product of factors: " + product);

        // Calculate the sum of squares of factors
        int sumOfSquares = findSumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
}
