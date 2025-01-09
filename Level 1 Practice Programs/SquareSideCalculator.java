// Creating Class with name SquareSideCalculator to calculate the side of the square.
import java.util.Scanner;

class SquareSideCalculator {
    public static void main(String[] args) {
        
        // Create a double variable to store the perimeter of the square
        double perimeter;
        
        // Create a double variable to store the calculated side of the square
        double side;
        
        // Create a Scanner object to take user input from Standard Input (keyboard)
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        
        // Take input from the user and store it in perimeter
        perimeter = input.nextDouble();
        
        // Calculate the side of the square using the formula: side = Perimeter / 4
        side = perimeter / 4;
        
        // Print the side of the square
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
