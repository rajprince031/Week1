// Create NumberSign class to check if a number is positive, negative, or zero
//Import Scanner Class for taking user input
import java.util.Scanner;

class NumberSign {
    public static void main(String[] args) {
        
        // Declare a variable to store the number
        int number;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the number
        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            // If the number is greater than zero, it's positive
            System.out.println("The number is positive.");
        } else if (number < 0) {
            // If the number is less than zero, it's negative
            System.out.println("The number is negative.");
        } else {
            // If the number is zero
            System.out.println("The number is zero.");
        }
    }
}
