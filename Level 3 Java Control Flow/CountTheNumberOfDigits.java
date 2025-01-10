// Import Scanner to read user input
import java.util.Scanner;

//create a CountTheNumberOfDigits class to count the number of digit in an Integer
public class CountTheNumberOfDigits {
    public static void main(String[] agrs){
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in); 

         // Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number entered by the user
        
        //Create a variable originalNumber that store the number variable in to it.
        int originalNumber = number;

        //Create a variable count and initialize it to 0.
        int count = 0;

        // Count digits using a while loop with a condition number that is not equal to 0.
        while(number != 0){

            //if the number is not equal to zero, then we increment the count variable by 1.
            count = count + 1;

            // now we divide the number by 10 to remove the last digit of the number and again store it in the number variable.
            number = number / 10;
        }
        //After the loop ends, print the count and originalNumber variable.
        System.out.println("There are "+count+" digits in a number "+originalNumber);
        
        
    }
}
