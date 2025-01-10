// Import Scanner to read user input
import java.util.Scanner;

//create a CalculatorUsingSwitchCase class to count the number of digit in an Integer
public class CalculatorUsingSwitchCase {
    public static void main(String[] agrs){
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in); 

         // Ask user to enter first number and store it to the first named variable
        System.out.print("Enter a first number: ");
        double first = input.nextDouble(); // Read the number entered by the user

        // Again ask user to enter second number and store it to the second named variable
        System.out.print("Enter a second number: ");
        double second = input.nextDouble(); // Read the number entered by the user

        // Now ask the user to enter the operator sign and store it in the op variable.
        System.out.print("Enter operator sign: ");
        String op = input.next(); // Read the number entered by the user
        
        //Create the result variable and store the final result.
        double result;

        //Write the switch case for doing the operation Addition, Subtraction, Multiplication and Division
        switch(op){
            // if the op variable is equal to "+" then we print Addition of two variable first and second
            case "+":
                result = first + second;
                System.out.println("The addition of two number "+first+" and "+second+" is "+result);
                break; //break is important to get out from the switch if the case if executed

            // if the op variable is equal to "-" then we print Subtraction of two variable first and second
            case "-":
                result = first - second;
                System.out.println("The subtraction of two number "+first+" and "+second+" is "+result);
                break; //break is important to get out from the switch if the case if executed

            // if the op variable is equal to "*" then we print Multiplication of two variable first and second
            case "*":
                result = first * second;
                System.out.println("The multipication of two number "+first+" and "+second+" is "+result);
                break; //break is important to get out from the switch if the case if executed

            // if the op variable is equal to "/" then we print Division of two variable first and second
            case "/":
                result = first / second;
                System.out.println("The division of two number "+first+" and "+second+" is "+result);
                break; //break is important to get out from the switch if the case if executed

            // if the op variable is other four sign then we print Invalid Operator
            default:
                System.out.println("Invalid Operator");
                break; //break is important to get out from the switch if the case if executed
        }
        
        
    }
}
