// Import Scanner to read user input
import java.util.Scanner;

public class BMICalculator2DArray {

    //create a calculateBMI method that calculate BMI
    public String[] calculateBMI(double[][]personData,int numPersons){
        //Create array that store the weight status of person
        String[] weightStatus = new String[numPersons];

        // Calculate BMI, find weight status, and store it in the arrays
        for (int i = 0; i < numPersons; i++) {
            // Calculate BMI
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi; // store BMI in 2D array

            // Determine weight status based on BMI
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        //return the weightStatus
        return weightStatus;
    }
    public static void main(String[] args) {

        //Create the object of BMICalculator2DArray class
        BMICalculator2DArray BMICalculator2DArray = new BMICalculator2DArray();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        //Create a variable numPerson and initialize the number of person
        int numPersons = 10;

        // Create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[numPersons][3]; // 3 columns: weight, height, BMI

        // Take input for the weight and height of the persons
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Take input for weight, ensuring it is positive
            double weight;
            do {
                System.out.print("Enter weight (in kg): ");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a valid positive weight.");
                }
            } while (weight <= 0);

            // Take input for height, ensuring it is positive
            double height;
            do {
                System.out.print("Enter height (in meters): ");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a valid positive height.");
                }
            } while (height <= 0);

            // Store weight and height in the 2D array
            personData[i][0] = weight; // weight
            personData[i][1] = height; // height
        }

        //Create array that store the weight status of person
        String[] weightStatus = BMICalculator2DArray.calculateBMI(personData,numPersons);

        
        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\n--- BMI Information ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}