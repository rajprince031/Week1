// Create OddEvenNumbers class to print odd and even numbers between 1 and the number entered by the user

import java.util.Scanner; // Import Scanner to take user input

class OddEvenNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Create Scanner object to take input
        
        // Ask user to enter a positive integer
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number entered by the user
        
        // Check if the entered number is a positive integer (natural number)
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Iterate through numbers from 1 to the entered number using a for loop
            for (int i = 1; i <= number; i++) {
                // Check if the current number is odd or even
                if (i % 2 == 0) {
                    // If the number is divisible by 2, it's even
                    System.out.println(i + " is an even number.");
                } else {
                    // Otherwise, it's odd
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }
}
