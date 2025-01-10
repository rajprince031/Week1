// Importing Scanner class to take user input
import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the base number
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        // Take user input for the power (exponent)
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initialize the result variable to 1
        int result = 1;

        // Use a for loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply the result with the base number in each iteration
        }

        // Display the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        
    }
}
