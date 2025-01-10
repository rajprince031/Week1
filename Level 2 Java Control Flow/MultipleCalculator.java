// Importing Scanner class to take user input
import java.util.Scanner;

public class MultipleCalculator {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Use a for loop to check multiples of the number from 100 to 1
        System.out.print("Multiples of " + number + " below 100 are: ");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {  
                System.out.print(i + " ");  
            }
        }

    }
}
