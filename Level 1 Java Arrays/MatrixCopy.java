// Import Scanner to read user input
import java.util.Scanner;

// Create MatrixCopy class to handle 2D to 1D array copying
public class MatrixCopy {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt(); // Read the number of rows

        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt(); // Read the number of columns

        // Create a 2D array (Matrix) with size rows x columns
        int[][] matrix = new int[rows][cols];

        // Ask the user to enter the elements of the 2D array
        System.out.println("Enter the elements of the " + rows + "x" + cols + " matrix:");

        // Loop through the matrix and take input for each element
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt(); // Read the element
            }
        }

        // Create a 1D array of size rows * columns
        int[] array = new int[rows * cols];

        // Define an index variable to keep track of the position in the 1D array
        int index = 0;

        // Copy the elements from the 2D array to the 1D array using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Copy each element from the 2D array into the 1D array
                array[index] = matrix[i][j];
                index++; // Increment the index for the 1D array
            }
        }

        // Display the 2D matrix
        System.out.println("The 2D matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " "); // Print each element in the matrix
            }
            System.out.println(); // Print a new line after each row
        }

        // Display the 1D array
        System.out.print("The 1D array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // Print each element in the 1D array
        }

        
    }
}
