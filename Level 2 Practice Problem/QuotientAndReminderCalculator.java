// Creating a class named QuotientAndReminderCalculator to calculate quotient and remainder of two numbers
import java.util.Scanner;

class QuotientAndReminderCalculator {
    public static void main(String[] args) {
        
        // Declare variables to store the two numbers
        int number1, number2;
        
        // Declare variables to store the quotient and remainder
        int quotient, remainder;
        
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the first number
        System.out.print("Enter the first number: ");
        
        // Take input from the user and store it in number1
        number1 = input.nextInt();
        
        // Ask the user to enter the second number
        System.out.print("Enter the second number: ");
        
        // Take input from the user and store it in number2
        number2 = input.nextInt();
        
        // Calculate the quotient using division operator
        quotient = number1 / number2;
        
        // Calculate the remainder using modulus operator
        remainder = number1 % number2;
        
        // Print the quotient and remainder
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
    }
}
