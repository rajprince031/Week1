// Create RocketLaunchCountdownUsingForLoop class to perform countdown
import java.util.Scanner;

class RocketLaunchCountdownUsingForLoop {
    public static void main(String[] args) {
        
        // Declare a variable to store the countdown value
        int counter;
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the countdown value
        System.out.print("Enter the countdown start value: ");
        counter = input.nextInt();
        
        // Use a for loop to count down from the entered value to 1
        for (int i = counter; i >= 1; i--) {
            // Print the countdown value
            System.out.println("T-" + i); 
        }
        
        // After the loop finishes, print a launch message
        System.out.println("Rocket Launch!");
    }
}
