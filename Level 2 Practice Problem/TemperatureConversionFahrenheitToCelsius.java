// Create TemperatureConversion class to convert Fahrenheit to Celsius

import java.util.Scanner;

class TemperatureConversionFahrenheitToCelsius {
    public static void main(String[] args) {
        
        // Declare a variable to store the Fahrenheit value
        double fahrenheit;
        
        // Declare a variable to store the calculated Celsius value
        double celsiusResult;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        
        // Read the temperature in Fahrenheit from user input
        fahrenheit = input.nextDouble();
        
        // Apply the Fahrenheit to Celsius conversion formula: (Fahrenheit − 32) × 5/9 = Celsius
        celsiusResult = (fahrenheit - 32) * 5 / 9;
        
        // Print the converted Celsius result
        System.out.println(fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
    }
}
