// Import Scanner to read user input
import java.util.Scanner;

// Create FizzBuzz class to implement the FizzBuzz logic
public class FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user for a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt(); // Read the number entered by the user

        // Check if the entered number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Create a String array to save the results of FizzBuzz
            String[] resultArray = new String[number + 1];

            // Loop from 1 to the entered number and apply FizzBuzz logic
            for (int i = 1; i <= number; i++) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    resultArray[i] = "FizzBuzz";
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    resultArray[i] = "Fizz";
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    resultArray[i] = "Buzz";
                }
                // Otherwise, store the number itself
                else {
                    resultArray[i] = String.valueOf(i);
                }
            }

            // Loop through the resultArray and print the result in the specified format
            for (int i = 1; i <= number; i++) {
                System.out.println("Position " + i + " = " + resultArray[i]);
            }
        }

    }
}
