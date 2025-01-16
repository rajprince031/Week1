import java.util.Scanner;
//Creating the class
public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.trim(); // Removing extra spaces from the input

        System.out.print("Enter the character to remove: ");
        char charToRemove = input.next().charAt(0); // Read the character to remove

        // Calling the method to remove the specified character
        String modifiedStr = removeCharacter(str, charToRemove);
        System.out.println("Modified String: \"" + modifiedStr + "\"");
    }

    // Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder(); // Using StringBuilder for efficient string manipulation

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Get the current character
            if (currentChar != charToRemove) {
                result.append(currentChar); // Append the character if it is not the one to remove
            }
        }

        return result.toString(); // Return the modified string
    }
}
