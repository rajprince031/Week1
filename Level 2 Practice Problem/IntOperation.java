// Create IntOperation class to perform various integer operations
import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        
        // Declare variables to store input values a, b, and c
        int a, b, c;
        
        // Declare variables to store the results of the operations
        int result1, result2, result3, result4;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter value for a
        System.out.print("Enter value for a: ");
        a = input.nextInt();
        
        // Ask the user to enter value for b
        System.out.print("Enter value for b: ");
        b = input.nextInt();
        
        // Prompt the user to enter value for c
        System.out.print("Enter value for c: ");
        c = input.nextInt();
        
        // Perform integer operations considering operator precedence

        // Multiplication happens first due to higher precedence than addition
        result1 = a + b * c;   

        // Multiplication happens first, then addition
        result2 = a * b + c;  

        // Division happens first, then addition
        result3 = c + a / b;   

        // Modulus happens first, then addition
        result4 = a % b + c;   
        
        // Print the results of the operations
        System.out.println("The results of Int Operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
