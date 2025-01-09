// Create SimpleInterestCalculator class to calculate simple interest
import java.util.Scanner;

class SimpleInterestCalculator {
    public static void main(String[] args) {
        
        // Declare variables to store the principal, rate, time, and simple interest
        double principal, rate, time, simpleInterest;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the principal, rate, and time
        System.out.print("Enter the principal amount: ");
        principal = input.nextDouble();
        
        System.out.print("Enter the rate of interest (in %): ");
        rate = input.nextDouble();
        
        System.out.print("Enter the time period (in years): ");
        time = input.nextDouble();
        
        // Calculate the Simple Interest using the formula
        simpleInterest = (principal * rate * time) / 100;
        
        // Print the results
        System.out.println("The Simple Interest is: " + simpleInterest);
        System.out.println("For Principal: " + principal + ", Rate of Interest: " + rate + "%, and Time: " + time + " years.");
    }
}
