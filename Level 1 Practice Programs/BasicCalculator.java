// Creating Class with name BasicCalculator indicating the purpose is to perform basic arithmetic operations

import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        
        // Create two double variables to store the numbers entered by the user
        float number1, number2;
        
        // Create double variables to store the results of the arithmetic operations
        float addition, subtraction, multiplication, division;
        
        // Create a Scanner object to take user input from Standard Input (keyboard)
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the first number
        System.out.print("Enter the first number: ");
        
        // Take input from the user and store it in number1
        number1 = input.nextFloat();
        
        // Ask the user to enter the second number
        System.out.print("Enter the second number: ");
        
        // Take input from the user and store it in number2
        number2 = input.nextFloat();
        
        // Perform addition
        addition = number1 + number2;
        
        // Perform subtraction
        subtraction = number1 - number2;
        
        // Perform multiplication
        multiplication = number1 * number2;
        
        // Perform division
        division = number1 / number2;
        
        // Display the results of all operations
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}
