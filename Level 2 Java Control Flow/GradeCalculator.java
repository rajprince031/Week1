import java.util.Scanner; // Import Scanner to read user input

// Create GradeCalculator class to calculate grade based on average marks
public class GradeCalculator {

    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter Physics marks and store the value in the variable 'physicsMarks'
        System.out.print("Enter Physics marks: ");
        double physicsMarks = scanner.nextDouble(); // Read Physics marks entered by the user

        // Ask the user to enter Chemistry marks and store the value in the variable 'chemistryMarks'
        System.out.print("Enter Chemistry marks: ");
        double chemistryMarks = scanner.nextDouble(); // Read Chemistry marks entered by the user

        // Ask the user to enter Maths marks and store the value in the variable 'mathsMarks'
        System.out.print("Enter Maths marks: ");
        double mathsMarks = scanner.nextDouble(); // Read Maths marks entered by the user

        // Calculate the total marks by adding Physics, Chemistry, and Maths marks
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;

        // Calculate the average marks by dividing the total marks by 3
        double averageMarks = totalMarks / 3;

        // Initialize the grade variable to store the final grade
        String grade = "";

        // Check if the average marks are 80 or above and assign the corresponding grade
        if (averageMarks >= 80) {
            grade = "A (Level 4, above agency-normalized standards)";
        }
        // Check if the average marks are between 70 and 79 and assign the corresponding grade
        else if (averageMarks >= 70) {
            grade = "B (Level 3, at agency-normalized standards)";
        }
        // Check if the average marks are between 60 and 69 and assign the corresponding grade
        else if (averageMarks >= 60) {
            grade = "C (Level 2, below, but approaching agency-normalized standards)";
        }
        // Check if the average marks are between 50 and 59 and assign the corresponding grade
        else if (averageMarks >= 50) {
            grade = "D (Level 1, well below agency-normalized standards)";
        }
        // Check if the average marks are between 40 and 49 and assign the corresponding grade
        else if (averageMarks >= 40) {
            grade = "E (Level 1-, too below agency-normalized standards)";
        }
        // If the average marks are below 40, assign "R" for remedial standards
        else {
            grade = "R (Remedial standards)";
        }

        // Print the average marks, formatted to 2 decimal places
        System.out.printf("Average Marks: %.2f\n", averageMarks);

        // Print the grade corresponding to the average marks
        System.out.println("Grade: " + grade);

    }
}
