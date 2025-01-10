// Create SmallestCheck class to check if the first number is the smallest among three numbers.
//Import Scanner class for taking Inputs from the user
import java.util.Scanner;

class SmallestCheck {
    public static void main(String[] args) {
        
        // Declaring variables to store the three numbers
        int number1, number2, number3;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the three numbers
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();
        
        System.out.print("Enter the third number: ");
        number3 = input.nextInt();
        
        // Check if the first number is the smallest
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);
        
        // Print the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
    }
}
