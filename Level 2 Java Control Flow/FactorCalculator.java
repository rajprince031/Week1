// Importing Scanner class to take user input
import java.util.Scanner;

public class FactorCalculator {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Use a for loop to find the factors of the number
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if the number is divisible by i
                System.out.print(i + " ");  // Print the factor
            }
        }

 
    }
}
