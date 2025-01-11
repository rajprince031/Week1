// Import Scanner to read user input
import java.util.Scanner;

// Create ZaraBonusCalculator class to calculate and display bonus for employees
public class ZaraBonusCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Define arrays to store salary and years of service of 10 employees
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];

        // Define arrays to store bonus, new salary and total variables
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to calculate the total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input for salary and years of service for 10 employees
        for (int i = 0; i < 10; i++) {
            // Ask the user to input salary and years of service
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = input.nextDouble();

            // Validate the salary input
            if (salary[i] <= 0) {
                System.out.println("Please enter a valid positive salary.");
                i--; // Decrement the index to retry the input
                continue;
            }

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextInt();

            // Validate the years of service input
            if (yearsOfService[i] < 0) {
                System.out.println("Please enter a valid number of years of service.");
                i--; // Decrement the index to retry the input
                continue;
            }
        }

        // Loop to calculate bonus and new salary, and accumulate total values
        for (int i = 0; i < 10; i++) {
            // Calculate the bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus for more than 5 years of service
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus for 5 years or less of service
            }

            // Calculate the new salary (old salary + bonus)
            newSalary[i] = salary[i] + bonus[i];

            // Update total bonus, total old salary, and total new salary
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print the total bonus payout, total old salary, and total new salary
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary of all employees: " + totalOldSalary);
        System.out.println("Total New Salary of all employees (after bonus): " + totalNewSalary);

        // Display the bonus and new salary details for each employee
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + " - Salary: " + salary[i] +
                    ", Years of Service: " + yearsOfService[i] + 
                    ", Bonus: " + bonus[i] + 
                    ", New Salary: " + newSalary[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}
