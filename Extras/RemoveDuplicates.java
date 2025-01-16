import java.util.Scanner;
//Creating the class
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.trim(); // Removing extra spaces from the input
        
        // Calling the method to remove duplicate characters
        String modifiedStr = removeDuplicates(str);
        System.out.println("String after removing duplicates: " + modifiedStr);
    }

    // Method for removing duplicate characters from the string
    public static String removeDuplicates(String str) {
        String result = ""; // To store the modified string
        
        // Loop to iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Get the current character
            if (result.indexOf(currentChar) == -1) { // Check if character is not already in the result
                result += currentChar; // Add the character to the result
            }
        }
        return result; // Return the modified string
    }
}
