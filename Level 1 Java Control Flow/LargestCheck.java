// Create LargestCheck class to check which number is the largest among three numbers.
//Import Scanner class for taking Inputs from the user
import java.util.Scanner;

class LargestCheck {
    public static void main(String[] args) {
        
        // Declare variables to store the three numbers
        int numberOne, numberTwo, numberThree;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the three numbers
        System.out.print("Enter the first number: ");
        numberOne = input.nextInt();
        
        System.out.print("Enter the second number: ");
        numberTwo = input.nextInt();
        
        System.out.print("Enter the third number: ");
        numberThree = input.nextInt();
        
        // Check if the first number is the largest
        boolean isFirstLargest = (numberOne >= numberTwo) && (numberOne >= numberThree);
        
        // Check if the second number is the largest
        boolean isSecondLargest = (numberTwo >= numberOne) && (numberTwo >= numberThree);
        
        // Check if the third number is the largest
        boolean isThirdLargest = (numberThree >= numberOne) && (numberThree >= numberTwo);
        
        // Display the results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}
