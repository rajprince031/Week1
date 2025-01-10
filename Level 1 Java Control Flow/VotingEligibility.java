// Create VotingEligibility class to check if a person can vote based on their age.
//Importing Scanner class for taking user inputs
import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        
        // Declare a variable to store the person's age
        int age;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the person's age
        System.out.print("Enter the person's age: ");
        age = input.nextInt();
        
        // Check if the person can vote (age >= 18)
        if (age >= 18) {
            // If the age is greater than or equal to 18, print that the person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If the age is less than 18, print that the person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
