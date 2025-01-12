// Import Scanner to read user input
import java.util.Scanner;

// Create StudentGrades class to calculate and display grades for students using a 2D array
public class StudentGrades2DArray {

    //Create a method calculatePercentage that calculate the percentage
    public double[] calculatePercentage(int numStudents, int[][] marks){

        //Create the array that store the percentage of the students
        double[] percentages = new double[numStudents];

        // Loop through each students and calculate the percentage
        for (int i = 0; i < numStudents; i++) {

            // Calculate percentage for the student
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
        }

        //Return the percentage array
        return percentages;
    }

    //Create a method calculateGrade that calculate the grades
    public char[] calculateGrade(double[] percentages, int numStudents){

        //Create the array that store the percentage of the students
        char[] grades = new char[numStudents];

        // Loop through each student to calculate the grades
        for (int i = 0; i < numStudents; i++) { 
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

        //Return the percentage array
        return grades;
    }

    //Create a method that generate 2 digit random marks for all the students in 2D array
    public int[][] generateRandomMarks(int numberOfStudents){

        // Create a 2D array to store marks for Physics, Chemistry, and Maths for each student
        int[][] marks = new int[numberOfStudents][3];

        // Loop through each student to assign the marks
        for (int i = 0; i < numberOfStudents; i++) {

            marks[i][0] = (int)(Math.random() * (99 - 10 + 1)+ 10); // take the random 2 digit number

            marks[i][1] = (int)(Math.random() * (99 - 10 + 1)+ 10); // take the random 2 digit number

            marks[i][2] = (int)(Math.random() * (99 - 10 + 1)+ 10); // take the random 2 digit number
        }

        //return the 2D array of marks
        return marks;

    }
    public static void main(String[] args) {

        StudentGrades2DArray StudentGrades2DArray =  new StudentGrades2DArray();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt(); // Read the number of students

        // Create a 2D array to store marks for Physics, Chemistry, and Maths for each student by the help of the generateRandomMarks method
        int[][] marks = StudentGrades2DArray.generateRandomMarks(numStudents); // 3 subjects for each student
        double[] percentages = StudentGrades2DArray.calculatePercentage(numStudents, marks); // To store percentage for each student
        char[] grades = StudentGrades2DArray.calculateGrade(percentages, numStudents); // To store grade for each student

        // Loop through each student to assign the marks
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nMarks for student " + (i + 1) + ":");
            marks[i][0] = (int)(Math.random() * (99 - 10 + 1)+ 10); // take the random 2 digit number
            System.out.print("Physics: "+ marks[i][0]);
            marks[i][1] = (int)(Math.random() * (99 - 10 + 1)+ 10); // take the random 2 digit number
            System.out.print("Chemistry: "+ marks[i][1]);
            marks[i][2] = (int)(Math.random() * (99 - 10 + 1)+ 10); // take the random 2 digit number
            System.out.print("Math: "+ marks[i][2]);
        }
        // Display the results
        System.out.println("\nResults:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");

        // Loop to display the details of each student
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.2f%%\t%c\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}
