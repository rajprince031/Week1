import java.util.Scanner;
//Creating the class
public class StringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String string1 = input.nextLine();
        string1 = string1.trim(); // Removing extra spaces from the first string
        
        System.out.print("Enter the second string: ");
        String string2 = input.nextLine();
        string2 = string2.trim(); // Removing extra spaces from the second string
        
        // Calling the method to compare the strings
        int comparisonResult = compareStrings(string1, string2);
        if (comparisonResult < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" lexicographically.");
        } else if (comparisonResult > 0) {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" lexicographically.");
        } else {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\" lexicographically.");
        }
    }

    // Method to compare two strings lexicographically without built-in methods
    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length()); // Length of the shorter string

        // Loop to compare characters at each position
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i); // Character from the first string
            char char2 = str2.charAt(i); // Character from the second string
            if (char1 != char2) {
                return char1 - char2; // Return the difference if characters differ
            }
        }

        // If characters match up to the shorter string length, compare lengths
        return str1.length() - str2.length();
    }
}
