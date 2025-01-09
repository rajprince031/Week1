
// Import Scanner to read user input
import java.util.Scanner; 

// Create SumOfNaturalNumbersUsingForLoop class to find the sum of n natural numbers using both formula and for loop
class SumOfNaturalNumbersUsingForLoop {
    public static void main(String[] args) {
        
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in); 
        
        // Ask user for input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt(); // Read the number entered by the user
        
        // Check if the entered number is a natural number (positive)
        if (n <= 0) {
            // If not a positive number, show an error message
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Calculate sum using the formula: n * (n + 1) / 2
            int sumFormula = (n * (n + 1)) / 2;
            
            // Calculate sum using a for loop
            int sumLoop = 0; // Initialize sum variable
            for (int i = 1; i <= n; i++) { // Loop from 1 to n
                sumLoop += i; // Add each number i to sumLoop
            }
            
            // Print the sum results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumLoop);
            
            // Compare the results and print if they match
            if (sumFormula == sumLoop) {
                System.out.println("Both methods give the same result, the sum is correct!");
            } else {
                System.out.println("There is a discrepancy in the results.");
            }
        }
    }
}
