import java.util.Scanner;
//Creating the class
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for numbers and operation choice
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Displaying the menu of operations
        System.out.println("Choose the operation you want to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = input.nextInt();

        // Performing the operation based on user choice
        switch (choice) {
            case 1:
                double additionResult = add(num1, num2);
                System.out.println("Result: " + additionResult);
                break;
            case 2:
                double subtractionResult = subtract(num1, num2);
                System.out.println("Result: " + subtractionResult);
                break;
            case 3:
                double multiplicationResult = multiply(num1, num2);
                System.out.println("Result: " + multiplicationResult);
                break;
            case 4:
                if (num2 != 0) {
                    double divisionResult = divide(num1, num2);
                    System.out.println("Result: " + divisionResult);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
        }
    }

    // Method to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
