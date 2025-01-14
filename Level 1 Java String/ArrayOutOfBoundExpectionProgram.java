import java.util.Scanner;

public class ArrayOutOfBoundExpectionProgram {

    public static void main(String[] args) {

        // Create the object of the the class ArrayOutOfBoundExpectionProgram
        ArrayOutOfBoundExpectionProgram ArrayOutOfBoundExpectionProgram = new ArrayOutOfBoundExpectionProgram();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Create a array
        int[] array = new int[size];

        // take a array element input from the user using loop
        for (int i = 0; i < size; i++) {

            // Ask for the enter element of the array
            System.out.print("Enter the "+(i+1)+" of the array: ");
            array[i] = input.nextInt();
        }

        // Ask for the index of the array
        System.out.print("Enter the index of the array: ");
        int index = input.nextInt();

        try {
            // handle number format exception
            ArrayOutOfBoundExpectionProgram.generateOutOfBoundException(array, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch any other NumberFormatException
            System.out.println("Error: Invalid input. Please enter a valid index.");
        } catch (RuntimeException e) {
            // Catch any other RuntimeException
            System.out.println("A runtime exception occurred: " + e.getMessage());
        }

    }

    // Method to generate a NumberFormatException
    public void generateOutOfBoundException(int[] array, int index) {
        // This will throw a ArrayOutOfBoundExpection if the index is not a valid
        int number = array[index];
        System.out.println("Number present at index " + index + ": " + number); // This line will not be executed if
                                                                                // exception occurs
    }

}