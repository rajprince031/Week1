import java.util.Scanner;
//Creating the class
public class ToggleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.trim(); // Removing extra spaces from the input

        // Calling the method to toggle the case of characters
        String toggledStr = toggleCase(str);
        System.out.println("String after toggling case: " + toggledStr);
    }

    // Method to toggle the case of each character in the string
    public static String toggleCase(String str) {
        StringBuilder toggledStr = new StringBuilder(); // Using StringBuilder for efficiency

        // Loop to iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Get the current character
            if (Character.isUpperCase(currentChar)) { // Check if the character is uppercase
                toggledStr.append(Character.toLowerCase(currentChar)); // Convert to lowercase
            } else if (Character.isLowerCase(currentChar)) { // Check if the character is lowercase
                toggledStr.append(Character.toUpperCase(currentChar)); // Convert to uppercase
            } else {
                toggledStr.append(currentChar); // Append non-alphabetic characters as is
            }
        }
        return toggledStr.toString(); // Convert StringBuilder to String and return
    }
}
