// Creating a class named HandshakeCalculator to calculate the maximum number of handshakes among students
import java.util.Scanner;

class HandshakeCalculator {
    public static void main(String[] args) {
        
        // Declare a variable for the number of students
        int numberOfStudents;
        
        // Declare a variable to store the total number of handshakes
        int totalHandshakes;
        
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        
        // Take input from the user and store it in numberOfStudents
        numberOfStudents = input.nextInt();
        
        // Use the combination formula to calculate the total handshakes: (n * (n - 1)) / 2
        totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Display the total number of handshakes
        System.out.println("The total number of handshakes among " + numberOfStudents + " students is: " + totalHandshakes);
    }
}
