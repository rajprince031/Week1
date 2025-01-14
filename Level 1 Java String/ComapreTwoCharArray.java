import java.util.Scanner;

public class ComapreTwoCharArray {

    public static void main(String[] args) {

        // Create the object of the the class ComapreTwoCharArray
        ComapreTwoCharArray ComapreTwoCharArray = new ComapreTwoCharArray();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the string input
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        //Create a char array
        char[] charArray1 = str.toCharArray();//this is inbuit method that convert string to char array

        char[] charArray2 = ComapreTwoCharArray.generateCharArray(str);
        // handle Exception
        try {

            //Create a variable isEqual and store the result
            boolean isEqual = ComapreTwoCharArray.compareCharArray(charArray1,charArray2);

            //check the result
            if(isEqual){
                System.out.println("Both method are giving same result");
            }else{
                System.out.println("Both method are giving different result");
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch any other NumberFormatException
            System.out.println("Error: Invalid input. Please enter a valid index.");
        } catch (RuntimeException e) {
            // Catch any other RuntimeException
            System.out.println("A runtime exception occurred: " + e.getMessage());
        }

    }


    //Method to generate a substring
    public char[] generateCharArray(String str){
        // This will throw a StringOutOfBoundExpection if the index is not a valid

        //Create a variable substr
        char[] charArray = new char[str.length()];

        //generate the substring using loop
        for(int i = 0; i < str.length(); i++){

            //Add a character to the char array 
            charArray[i] = str.charAt(i);

        }

        //return the char array
        return charArray;

    }

    //Create a method that check two char array is equal or not
    public boolean compareCharArray(char[] charArray1, char[] charArray2){

        //Check the length of the array if different return false
        if(charArray1.length != charArray1.length){
            return false;
        }

        //Take a loop that compare character using charAt method
        for(int i=0;i<charArray1.length;i++){
            if(charArray1[i] != charArray2[i]){
                return false; // if we found the different char at same index return false
            }
        }
        return true;//at the end return true
    }

}