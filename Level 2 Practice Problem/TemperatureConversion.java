// Create TemperatureConversion class to convert Celsius to Fahrenheit
import java.util.Scanner;

class TemperatureConversion {
    public static void main(String[] args) {
        
        // Declare a variable to store the Celsius value
        double celsius;
        
        // Declare a variable to store the calculated Fahrenheit value
        double fahrenheitResult;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        
        // Read the temperature in Celsius from user input
        celsius = input.nextDouble();
        
        // Apply the Celsius to Fahrenheit conversion formula: (°C × 9/5) + 32 = °F
        fahrenheitResult = (celsius * 9/5) + 32;
        
        // Print the converted Fahrenheit result
        System.out.println(celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");
    }
}
