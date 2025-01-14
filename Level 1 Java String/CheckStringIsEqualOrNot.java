
import java.util.Scanner;

//Create CheckStringIsEqualOrNot to check the string is equal or not
public class CheckStringIsEqualOrNot{
    
    //Create a method that use built in function to check the strings are equal or not
    public boolean compareStringsUsingEquals(String str1, String str2){
        return str1.equals(str2);
    }

    //Create a method that use charAt method to check the string are equal or not
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

    public static void main(String[] agrs){

        //Create the object of the the class checkStringIsEqualOrNot
        CheckStringIsEqualOrNot CheckStringIsEqualOrNot = new CheckStringIsEqualOrNot();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the first string input
        System.out.print("Enter the first string: ");
        String str1 = input.next();

        // Ask for the second string input
        System.out.print("Enter the second string: ");
        String str2 = input.next();

        //Create a variable resultUsingCharAt that store the result that return by compareStringsUsingCharAt method
        boolean resultUsingCharAt = CheckStringIsEqualOrNot.compareStringsUsingCharAt(str1, str2);

        //Create a variable resultUsingCharAt that store the result that return by compareStringsUsingCharAt method
        boolean resultUsingEquals = CheckStringIsEqualOrNot.compareStringsUsingEquals(str1, str2);
        
        //print the result
        System.out.println("Comparison using charAt(): " + resultUsingCharAt);

        System.out.println("Comparison using equals(): " + resultUsingEquals);

        // Close the scanner to prevent resource leak
        input.close();

    }
}