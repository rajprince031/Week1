// Import Scanner to read user input
import java.util.Scanner;

// Create StudentGrades class to calculate and display grades for students
public class StudentGrades {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt(); // Read the number of students

        // Create arrays to store the marks, percentages, and grades for each student
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Loop through each student to take input for marks and calculate the grade
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            // Loop to ensure non-negative marks are entered
            do {
                System.out.print("Physics: ");
                physicsMarks[i] = input.nextInt(); // Read physics marks

                System.out.print("Chemistry: ");
                chemistryMarks[i] = input.nextInt(); // Read chemistry marks

                System.out.print("Maths: ");
                mathsMarks[i] = input.nextInt(); // Read maths marks

                // Validate that all marks are non-negative
                if (physicsMarks[i] < 0 || chemistryMarks[i] < 0 || mathsMarks[i] < 0) {
                    System.out.println("Please enter non-negative marks.");
                }
            } while (physicsMarks[i] < 0 || chemistryMarks[i] < 0 || mathsMarks[i] < 0);

            // Calculate percentage and store in the percentages array
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

            // Determine the grade based on the percentage
            if (percentages[i] >= 80) {
                grades[i] = 'A'; // Assign grade 'A' for percentage >= 80
            } else if (percentages[i] >= 70) {
                grades[i] = 'B'; // Assign grade 'B' for percentage >= 70
            } else if (percentages[i] >= 60) {
                grades[i] = 'C'; // Assign grade 'C' for percentage >= 60
            } else if (percentages[i] >= 50) {
                grades[i] = 'D'; // Assign grade 'D' for percentage >= 50
            } else if (percentages[i] >= 40) {
                grades[i] = 'E'; // Assign grade 'E' for percentage >= 40
            } else {
                grades[i] = 'R'; // Assign grade 'R' for percentage < 40 (Fail)
            }
        }

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");

        // Loop to display the details of each student
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%.2f%%\t\t%c\n",
                    i + 1, physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}
