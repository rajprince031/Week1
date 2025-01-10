// create FactorialCalculatorUsingForLoop class to calculate the factorial of a number using a for loop

import java.util.Scanner; // Import Scanner to read user input

class FactorialCalculatorUsingForLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Create Scanner object to take input
        
        // Ask user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt(); // Read the number entered by the user
        
        // Check if the entered number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize the factorial variable
            long factorial = 1; // We use long to store large results of factorials
            
            // Compute factorial using a for loop
            // Loop from 1 to 'number'
            for (int i = 1; i <= number; i++) { 

                // Multiply factorial by i
                factorial *= i; 
            }
            
            // Print the result
            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}
