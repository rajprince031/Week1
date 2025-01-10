//Import Scanner Class For taking user input
import java.util.Scanner;

class NaturalNumberSum {
    public static void main(String[] args) {
        
        // Declare a variable to store the input number
        int number;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the number
        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        // Check if the number is a natural number (positive integer)
        if (number > 0) {
            // Calculate the sum of the first n natural numbers using the formula n * (n + 1) / 2
            int sum = number * (number + 1) / 2;
            
            // Display the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Display if the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
