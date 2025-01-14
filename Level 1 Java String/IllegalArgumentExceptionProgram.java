
import java.util.Scanner;

//Create illegalArgumentException to demonstrate IllegalArgumentException
public class IllegalArgumentExceptionProgram{
    
    public static void main(String[] agrs){

        //Create the object of the the class IllegalArgumentExceptionProgram
        IllegalArgumentExceptionProgram IllegalArgumentExceptionProgram = new IllegalArgumentExceptionProgram();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the string input
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        // Ask for the starting index input
        System.out.print("Enter the starting index: ");
        int start = input.nextInt();

        // Ask for the ending index input
        System.out.print("Enter the ending index: ");
        int end = input.nextInt();

        try{
            String substr = IllegalArgumentExceptionProgram.generateSubString(str,start,end);
            System.out.println("Generated substring :"+substr);
        }catch(IllegalArgumentException e){
            //print the error message
            System.out.println(e);
        }

        // Close the scanner to prevent resource leak
        input.close();

    }

    //Create a method to generate substring
    public String generateSubString(String str, int start, int end){
        if(start > end){
            throw new IllegalArgumentException("Staring index should be less than ending index");
        }
        return str.substring(start,end);
    }

    
}