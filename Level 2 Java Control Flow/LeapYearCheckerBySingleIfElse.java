// Import Scanner to read user input
import java.util.Scanner;

// Create LeapYearChecker class to check if a year is a Leap Year
public class LeapYearCheckerBySingleIfElse {
    public static void main(String[] args){
        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask user to enter a year to check if it's a Leap Year
        System.out.print("Enter a year: ");
        int year = input.nextInt(); // Read the year entered by the user

        // Check if the year is valid (greater than or equal to 1582)
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            // If the year is valid and satisfies leap year conditions
            System.out.println(year + " is a Leap Year.");
        } else if (year < 1582) {
            // If the year is less than 1582, output a message for invalid input
            System.out.println("Please enter a year greater than or equal to 1582.");
        } else {
            // If the year doesn't satisfy leap year conditions
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
