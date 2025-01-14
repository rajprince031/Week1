import java.util.Scanner;

public class NumberFormatExpectionProgram{

    public static void main(String[] args){

        //Create the object of the the class SplitAndFindLength
        NumberFormatExpectionProgram NumberFormatExpectionProgram = new NumberFormatExpectionProgram();
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the string input
        System.out.print("Enter the string value: ");
        String str = input.nextLine();

        try{
            //handle number format exception
            NumberFormatExpectionProgram.generateNumberFormatException(str);
        }catch(NumberFormatException e){
            // Catch any other NumberFormatException
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }catch (RuntimeException e) {
            // Catch any other RuntimeException
            System.out.println("A runtime exception occurred: " + e.getMessage());
        }

    }

    // Method to get the length of a string
    public int getLength(String str){
        // This will throw NullPointerException if str is null
        return str.length();
    }


    // Method to generate a NumberFormatException
    public void generateNumberFormatException(String text) {
        // This will throw a NumberFormatException if the input is not a valid integer
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);  // This line will not be executed if exception occurs
    }

}