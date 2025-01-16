import java.util.Scanner;
//Creating the class
public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = input.nextLine();
        mainString = mainString.trim(); // Removing extra spaces from the main string

        System.out.print("Enter the substring to find: ");
        String subString = input.nextLine();
        subString = subString.trim(); // Removing extra spaces from the substring

        // Calling the method to count substring occurrences
        int count = countSubstringOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" occurs " + count + " time(s) in the main string.");
    }

    // Method to count occurrences of a substring in a string
    public static int countSubstringOccurrences(String mainString, String subString) {
        if (subString.isEmpty()) {
            return 0; // If substring is empty, return 0
        }

        int count = 0; // To store the occurrence count
        int index = 0; // Starting index for the search

        // Loop to find all occurrences of the substring
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++; // Increment the count when a match is found
            index += subString.length(); // Move the index to continue searching
        }
        return count; // Return the total count of occurrences
    }
}
