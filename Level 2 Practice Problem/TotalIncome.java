// Create TotalIncome class to calculate total income by adding salary and bonus
import java.util.Scanner;

class TotalIncome {
    public static void main(String[] args) {
        
        // Declare variables for salary and bonus
        double salary, bonus, totalIncome;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter their salary
        System.out.print("Enter your salary (INR): ");
        salary = input.nextDouble();
        
        // Ask the user to enter their bonus
        System.out.print("Enter your bonus (INR): ");
        bonus = input.nextDouble();
        
        // Calculate the total income by adding salary and bonus
        totalIncome = salary + bonus;
        
        // print the salary, bonus, and total income
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}
