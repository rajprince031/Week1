// Import Scanner to read user input
import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Create arrays to store the weight, height, BMI, and weight status of the persons
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        // Take input for the weight and height of the persons
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            System.out.print("Enter weight (in kg): ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height (in meters): ");
            height[i] = input.nextDouble();
        }

        // Calculate BMI and find weight status for each person
        for (int i = 0; i < numPersons; i++) {
            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\n--- BMI Information ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + String.format("%.2f", bmi[i]));
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        // Close the Scanner Object
        input.close();
       
    }
}
