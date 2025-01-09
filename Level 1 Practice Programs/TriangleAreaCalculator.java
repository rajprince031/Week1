// Creating Class with name TriangleAreaCalculator indicating the purpose is to calculate area of a triangle
import java.util.Scanner;

class TriangleAreaCalculator {
    public static void main(String[] args) {
        
        // Create two double variables to store the base and height of the triangle
        double base, height;
        
        // Create double variables to store the area of the triangle in square inches and square centimeters
        double areaInches, areaCm;
        
        // Create a Scanner object to take user input from Standard Input (keyboard)
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the base of the triangle in inches
        System.out.print("Enter the base of the triangle in inches: ");
        
        // Take input from the user and store it in base
        base = input.nextDouble();
        
        // Ask the user to enter the height of the triangle in inches
        System.out.print("Enter the height of the triangle in inches: ");
        
        // Take input from the user and store it in height
        height = input.nextDouble();
        
        // Calculate the area of the triangle in square inches using the formula: Area = ½ * base * height
        areaInches = 0.5 * base * height;
        
        // Convert the area from square inches to square centimeters using the conversion factor: 1 inch = 2.54 cm
        areaCm = areaInches * (2.54 * 2.54);
        
        // Display the results of the area in both square inches and square centimeters
        System.out.println("The area of the triangle is " + areaInches + " square inches or " + areaCm + " square centimeters.");
    }
}
