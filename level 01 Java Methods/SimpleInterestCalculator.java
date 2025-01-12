// Create SimpleInterestCalculator class to calculate simple interest
import java.util.Scanner;

class SimpleInterestCalculator {

    //Create a method name calculateSimpleInterest to calculate the simple interest
    public double calculateSimpleInterest(double principal, double rate, double time){

        //Create a variable name simpleInterest to store the value to calculated simple interest

        // Calculate the Simple Interest using the formula
        double simpleInterest = (principal * rate * time) / 100;

        //return the simple Interest
        return simpleInterest;

    }
    public static void main(String[] args) {

        //Create the object of SimpleInterestCalculator
        SimpleInterestCalculator SimpleInterestCalculator = new SimpleInterestCalculator();
        
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
        
        // Calculate the Simple Interest using calculateSimpleInterest method
        simpleInterest = SimpleInterestCalculator.calculateSimpleInterest(principal, rate, time);//call the method and pass the argument to calculate the simple interest
        
        // Print the results
        System.out.println("The Simple Interest is " + simpleInterest+" For Principal " + principal + ", Rate of Interest " + rate + "%, and Time " + time + " years.");
    }
}
