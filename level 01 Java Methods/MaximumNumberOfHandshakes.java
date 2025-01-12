// Creating a class named HandshakeCalculator to calculate the maximum number of handshakes among students
import java.util.Scanner;

class MaximumNumberOfHandshakes {

    //Create a method name calculateHandShakes to calculate the Hand shake
    public int calculateHandShakes(int numberOfStudents){

        //Create a variable name totalHandshakes to store the value to calculated maximum hand shake
        // Use the combination formula to calculate the total handshakes: (n * (n - 1)) / 2
        int totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        //return the totalHandshakes
        return totalHandshakes;

    }
    public static void main(String[] args) {

        //Create the object of MaximumNumberOfHandshakes class
        MaximumNumberOfHandshakes MaximumNumberOfHandshakes = new MaximumNumberOfHandshakes();
        
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
        
        // Calculate the total hand shakes using calculateSimpleInterest method
        totalHandshakes = MaximumNumberOfHandshakes.calculateHandShakes(numberOfStudents);//call the method and pass the argument to calculate the hand shakes
        
        // Display the total number of handshakes
        System.out.println("The total number of handshakes among " + numberOfStudents + " students is " + totalHandshakes);
    }
}
