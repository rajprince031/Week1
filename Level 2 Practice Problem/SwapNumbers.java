// Create SwapNumbers class to swap two numbers entered by the user
import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        
        // Declare two variables for the numbers
        double number1, number2, temp;  // temp is used for swapping
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the first number
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        
        // Ask the user to enter the second number
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();
        
        // Swap the values using a temporary variable
        temp = number1;
        number1 = number2;
        number2 = temp;
        
        // Print the swapped values
        System.out.println("The swapped numbers are: " + number1 + " and " + number2);
    }
}
