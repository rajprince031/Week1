// Import Scanner to read user input
import java.util.Scanner;

// Create PrimeNumberChecker class to check if a number is prime
public class PrimeNumberChecker {
    public static void main(String[] args){
        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask user to enter a number to check if it's a prime number
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number entered by the user

        // Variable to store the result of prime check
        boolean isPrime = true; // Assume the number is prime initially

        // Prime number checks are only done for numbers greater than 1
        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            // Loop from 2 to the number-1 and check for divisibility
            for (int i = 2; i < number; i++) {
                // If the number is divisible by 'i', it is not prime
                if (number % i == 0) {
                    isPrime = false; // Set isPrime to false
                    break; // Exit the loop as the number is not prime
                }
            }
        }

        // Output result based on the value of isPrime
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}
