// Import Scanner class for taking user input
import java.util.Scanner; 

// Create MultiplicationTable class to find the multiplication table of a number from 6 to 9
class MultiplicationTable {
    public static void main(String[] args) {
        
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in); 
        
        // Ask user to enter a number
        System.out.print("Enter a number: ");

        // Read the number entered by the user
        int number = input.nextInt(); 
        
        // Using for loop to calculate and print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Print the multiplication result in the format: number * i = result
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
