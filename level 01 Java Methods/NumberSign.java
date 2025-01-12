// Create NumberSign class to check if a number is positive, negative, or zero
//Import Scanner Class for taking user input
import java.util.Scanner;

class NumberSign {

    //Create a method name checkNumberSign to check the sign of the number.
    public int checkNumberSign(int number){
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            // If the number is greater than zero, it's positive
            return 1;
        } else if (number < 0) {
            // If the number is less than zero, it's negative
            return -1;
        } else {
            // If the number is zero
            return 0;
        }

    }
    public static void main(String[] args) {
        
        //Create the object of NumberSign class
        NumberSign NumberSign = new NumberSign();

        // Declare a variable to store the number
        int number;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the number
        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        // Create a variable that store the result that return the checkNumberSign method
        int result = NumberSign.checkNumberSign(number);//call the method and pass the argument to calculate the hand shakes
        
        if (result == 1) {
            // Check if the result is 1
            System.out.println("The number is positive.");
        } else if (number < 0) {
            // If the result is -1, it's negative
            System.out.println("The number is negative.");
        } else {
            // If the result is zero
            System.out.println("The number is zero.");
        }

        
    }
}
