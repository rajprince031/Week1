// Create DivisibilityCheck class to check if a number is divisible by 5
//Import Scanner class for taking Inputs from the user
import java.util.Scanner;

class DivisibilityCheck{
    public static void main(String[] args){
        
        // Declare a variable to store the input number
        int number;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the number
        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        // Check if the number is divisible by 5
        boolean isDivisibleBy5 = (number%5 == 0);
        
        // Display the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleBy5);
    }
}
