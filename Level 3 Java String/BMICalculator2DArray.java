// Import Scanner to read user input
import java.util.Scanner;

public class BMICalculator2DArray {
    public static void main(String[] args) {

        //Create the object of BMICalculator2DArray
        BMICalculator2DArray BMICalculator2DArray = new BMICalculator2DArray();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[numPersons][2]; // 3 columns: weight, height, BMI

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
                System.out.print("Enter height (in cms): ");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a valid positive height.");
                }
            } while (height <= 0);

            // Store weight and height in the 2D array
            personData[i][0] = weight; // weight
            personData[i][1] = height / 100; // convert height in meter
        }

        //Create the 2D array that store the bmiStatus 
        String[][] bmiStatus = BMICalculator2DArray.calculateBMI(personData,numPersons);
        
        //Display Person data
        BMICalculator2DArray.displayPersonData(bmiStatus, numPersons);

        // Close the Scanner Object
        input.close();
    }

    //Create the method that calculate the BMI of the person
    public String[][] calculateBMI(double[][] personData,int numPersons){

        //Create the 2D array that store the bmiStatus
        String[][] bmiStatus = new String[numPersons][4];
        // Calculate BMI, find weight status, and store it in the arrays
        for (int i = 0; i < numPersons; i++) {
            // Calculate BMI
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            bmiStatus[i][2] = String.valueOf(bmi); // store BMI in 2D array

            bmiStatus[i][0] = String.valueOf(personData[i][0]);// Store weight of the person
            bmiStatus[i][1] = String.valueOf(personData[i][1]);// Store the height of the person
            // Determine weight status based on BMI
            if (bmi < 18.5) {
                bmiStatus[i][3] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                bmiStatus[i][3] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                bmiStatus[i][3] = "Overweight";
            } else {
                bmiStatus[i][3] = "Obesity";
            }
        }

        
        //return the array
        return bmiStatus;
    }
    //Create the method that display the person data
    public void displayPersonData(String[][] bmiStatus,int numPersons){
        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\n--- BMI Information ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + bmiStatus[i][1] + " meters");
            System.out.println("Weight: " + bmiStatus[i][0] + " kg");
            System.out.println("BMI: " + bmiStatus[i][2]);
            System.out.println("Weight Status: " + bmiStatus[i][3]);
        }   
    }
}
