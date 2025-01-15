
import java.util.Scanner;

//Create LengthOfTheString class to find the length of the string
public class FindLengthOfTheString{
    
    public static void main(String[] agrs){

        //Create the object of the the class FindLengthOfTheString
        FindLengthOfTheString FindLengthOfTheString = new FindLengthOfTheString();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the string input
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        
        //Create the length1 variable and store the result return by calculateLength method
        int length1 = FindLengthOfTheString.calculateLength(str);

        //Create the length2 variable and store the result return by builtin length method
        int length2 = str.length();

        //print the result
        System.out.printf("The Length of %s is %d using userdefined method.\n",str,length1);
        System.out.printf("The Length of %s is %d using built-in method.",str,length2);

        // Close the scanner to prevent resource leak
        input.close();

    }

    //Create a method calculateLength to calculate the length of the string.
    public int calculateLength(String str){

        //Create a variable and initlize it zero to count the word in the string
        int counter = 0;

        try{
            //Take a loop to itrate over the string
            while(str.charAt(counter) > 0){

                //if the string is not empty then increse the counter variable
                counter++;
            }
        }catch(IndexOutOfBoundsException e){

            //if the error is occur means the string is end so retrun the counter variable
            return counter;
        }


        //return the counter
        return counter;
    }

    
}