// Creating a class named RocketLaunchCountdown to perform countdown
//Importing the Scanner for taking user input
import java.util.Scanner;

class RocketLaunchCountdown {
    public static void main(String[] args) {
        
        // Declare a variable to store the countdown value
        int counter;
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the countdown value
        System.out.print("Enter the countdown start value: ");
        counter = input.nextInt();
        
        // Use a while loop to count down from the entered value to 1
        while (counter >= 1) {
            // Print the countdown value
            System.out.println("T-" + counter); 
            
            // Decrement the counter by 1
            counter--;
        }
        
        // After the loop finishes, print a launch message
        System.out.println("Rocket Launch!");
    }
}

