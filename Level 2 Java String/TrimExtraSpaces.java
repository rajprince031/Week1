import java.util.Scanner;

//Create TrimExtraSpaces to trim extra spaces from the start and the end.
public class TrimExtraSpaces{
    
    public static void main(String[] agrs){

        //Create the object of the the class TrimExtraSpaces
        TrimExtraSpaces TrimExtraSpaces = new TrimExtraSpaces();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the string input
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        //Remove the spaces from the start and end using trim method
        String str1 = str.trim();

        //Remove the spaces from the start and end using user defined method
        String str2 = TrimExtraSpaces.removeExtraSpaces(str1);


        //Create a variable isEqual that store the result that return by compareStringsUsingCharAt method
        boolean isEqual = TrimExtraSpaces.compareStringsUsingCharAt(str1, str2);

        //print the result
        if(isEqual){
            System.out.println("Both method give same results");
        }else{
            System.out.println("Both method give different results");
        }

        // Close the scanner to prevent resource leak
        input.close();

    }

    //Create a method removeExtraSpaces to remove extra spaces
    public String removeExtraSpaces(String str){

        //Create a variable and initialize it zero to count the word in the string
        int startIndex = 0;
        int endIndex = 0;

        //check the character from the start untill we find the character that not equal to space using loop
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){

                //mark the index and break the loop
                startIndex = i;
                break;
            }
        }

        //check the character from the end untill we find the character that not equal to space using loop
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) != ' '){

                //mark the index and break the loop
                endIndex = i;
                break;
            }
        }


        //return the substring from the startIndex to endIndex
        return str.substring(startIndex,endIndex+1);
    }

    //Create a method that using charAt() method to check the string are equal or not
    public boolean compareStringsUsingCharAt(String str1, String str2){

        //Check the length of string if different return false
        if(str1.length() != str2.length()){
            return false;
        }

        //Take a loop that compare string using charAt method
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false; // if we found the different char at same index return false
            }
        }
        return true;//at the end return true
    }

    
}