// Importing Scanner class to take user input
import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take an integer input from the user
        System.out.print("Enter a number to find its greatest factor (other than itself): ");
        int number = input.nextInt();

        // Initialize the greatest factor variable
        int greatestFactor = 1;

        // Use a for loop to find the greatest factor of the number
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                greatestFactor = i; // Assign i to greatestFactor
                break; // Break the loop as we found the greatest factor
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

    }
}
