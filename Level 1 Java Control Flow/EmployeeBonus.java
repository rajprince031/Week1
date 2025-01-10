
// Import Scanner class for taking user input
import java.util.Scanner; 

// Create EmployeeBonus class to calculate bonus based on years of service and salary
class EmployeeBonus {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Create Scanner object to take input
        
        // Ask user to enter salary and years of service
        System.out.print("Enter the employee's salary: ");

        // Read salary value
        double salary = input.nextDouble(); 
        
        System.out.print("Enter the employee's years of service: ");
        // Read years of service value
        int yearsOfService = input.nextInt(); 
        
        // Check if years of service is greater than 5 for bonus
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of salary
            double bonus = salary * 0.05;
            System.out.println("The employee's bonus is INR " + bonus);
        } else {
            // If years of service is 5 or less, no bonus is given
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
