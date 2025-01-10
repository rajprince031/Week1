// Import Scanner to read user input
import java.util.Scanner;

// Create DayOfWeek class to determine the day of the week for a given date
public class DayOfWeek {
    public static void main(String[] args){
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in); 

        // Ask user to enter the month, day, and year for the date
        System.out.print("Enter month (1-12): ");
        int m = input.nextInt(); // Read the month entered by the user

        System.out.print("Enter day (1-31): ");
        int d = input.nextInt(); // Read the day entered by the user

        System.out.print("Enter year: ");
        int y = input.nextInt(); // Read the year entered by the user

        // Variables to store intermediate calculations
        int y0, x, m0, d0;

        // Apply the formula for the Gregorian calendar
        y0 = y - (14 - m) / 12;
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        m0 = m + 12 * ((14 - m) / 12) - 2;
        d0 = (d + x + (31 * m0) / 12) % 7;

        // Print the day of the week (0 for Sunday, 1 for Monday, etc.)
        System.out.println("The day of the week is: " + d0);
    }
}
