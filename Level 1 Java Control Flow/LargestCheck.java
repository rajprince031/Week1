// Create LargestCheck class to check which number is the largest among three numbers.
import java.util.Scanner;

class LargestCheck {
    public static void main(String[] args) {
        
        // Declare variables to store the three numbers
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
        
        // Check if the first number is the largest
        boolean isFirstLargest = (number1 >= number2) && (number1 >= number3);
        
        // Check if the second number is the largest
        boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);
        
        // Check if the third number is the largest
        boolean isThirdLargest = (number3 >= number1) && (number3 >= number2);
        
        // Display the results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}
