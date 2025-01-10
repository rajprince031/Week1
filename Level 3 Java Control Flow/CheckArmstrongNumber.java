// Import Scanner to read user input
import java.util.Scanner;

// create a checkArmstrongNumber class to check if the number is Armstrong or not.
public class CheckArmstrongNumber {
    public static void main(String[] agrs){
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in); 

         // Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number entered by the user

        // Create a variable of originalNumber to store the user input number to the originalNumber
        int originalNumber = number;

        //Create a variable sum and initialize it to 0.
        int sum = 0;

        // Compute Armstrong using a while loop with a condition number that is not equal to 0.
        while(number != 0){
            //Create a variable remainder that stores the remainder of the variable number when we divide the number by 10.
            int remainder = number % 10;

            //find the cube of the of the remainder and add to sum of the variable
            sum = sum + (int)Math.pow(remainder,3);

            // now we divide the number by 10 to remove the last digit of the number and again store it in the number variable.
            number = number / 10;
        }
        //After the loops ends, we check the value of originalNumber variable and sum varibale.
        if(originalNumber == sum){
            //if this condition is true,then print its Armstrong number.
            System.out.println("The number "+originalNumber+" is an Armstrong number");
        }else{
            //if this condition is false,then print its not an Armstrong number.
            System.out.println("The number "+originalNumber+" is not an Armstrong number");
        }
    }
}


