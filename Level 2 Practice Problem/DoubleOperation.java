// Create DoubleOperation to perform various operations with double values
import java.util.Scanner;

class DoubleOperation {
    public static void main(String[] args) {
        
        // Declare variables to store the three input values as double data type
        double a, b, c;
        
        // Declare variables to store the results of the operations
        double result1, result2, result3, result4;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the first value for a (as a double)
        System.out.print("Enter value for a: ");
        a = input.nextDouble();
        
        // Ask the user to enter the second value for b (as a double)
        System.out.print("Enter value for b: ");
        b = input.nextDouble();
        
        // Ask the user to enter the third value for c (as a double)
        System.out.print("Enter value for c: ");
        c = input.nextDouble();
        
        // Perform arithmetic operations considering operator precedence

        // Multiplication happens first due to higher precedence than addition
        result1 = a + b * c;

        // Multiplication happens first, then addition
        result2 = a * b + c;   

        // Division happens first, then addition
        result3 = c + a / b;   

        // Modulus happens first, then addition
        result4 = a % b + c;   
        
        // Print the results of the operations
        System.out.println("The results of Double Operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
