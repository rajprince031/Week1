import java.util.Scanner;

public class StringIndexOutOfBoundExceptionProgram {

    public static void main(String[] args) {

        // Create the object of the the class StringIndexOutOfBoundExceptionProgram
        StringIndexOutOfBoundExceptionProgram StringIndexOutOfBoundExceptionProgram = new StringIndexOutOfBoundExceptionProgram();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

       // Ask for the string input
        System.out.print("Enter the string value: ");
        String str = input.nextLine();

        // Ask for the index of the string
        System.out.print("Enter the index of the string: ");
        int index = input.nextInt();

        try {
            // handle number format exception
            StringIndexOutOfBoundExceptionProgram.generateOutOfBoundException(str, index);
        } catch (StringIndexOutOfBoundsException e) {
            // Catch any other NumberFormatException
            System.out.println("Error: Invalid input. Please enter a valid index.");
        } catch (RuntimeException e) {
            // Catch any other RuntimeException
            System.out.println("A runtime exception occurred: " + e.getMessage());
        }

    }

    // Method to generate a NumberFormatException
    public void generateOutOfBoundException(String str, int index) {
        // This will throw a StringOutOfBoundExpection if the index is not a valid
        char character = str.charAt(index);
        System.out.println("Character present at index " + index + ": " + character); // This line will not be executed if
                                                                                // exception occurs
    }

}