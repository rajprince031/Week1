import java.util.Scanner;
//Creating the class
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user for the temperature and conversion choice
        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();

        System.out.print("Enter 1 to convert from Fahrenheit to Celsius, or 2 to convert from Celsius to Fahrenheit: ");
        int choice = input.nextInt();

        // Calling the appropriate function based on user input and displaying the result
        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is equal to " + celsius + " Celsius.");
        } else if (choice == 2) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Formula: (Fahrenheit - 32) * 5/9 = Celsius
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Formula: (Celsius * 9/5) + 32 = Fahrenheit
    }
}
