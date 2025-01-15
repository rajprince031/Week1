import java.util.Scanner;

public class CharacterFrequencyNestedLoop {

    // Method to find the frequency of characters in a string
    public static String[] findFrequency(String text) {
        char[] characters = text.toCharArray();  // Convert the input string to a character array
        int[] frequency = new int[characters.length];  // Array to store the frequency of each character
        StringBuilder result = new StringBuilder();  // StringBuilder to build the result string

        // Outer loop to iterate through each character in the array
        for (int i = 0; i < characters.length; i++) {
            // If the character has not been counted yet (not marked as '0')
            if (characters[i] != '0') {
                int count = 1;  // Initialize the count for the current character

                // Inner loop to check for duplicates of the current character
                for (int j = i + 1; j < characters.length; j++) {
                    // If a duplicate is found
                    if (characters[i] == characters[j]) {
                        count++;  // Increment the count
                        characters[j] = '0';  // Mark this character as counted to avoid recounting
                    }
                }

                // Append the character and its frequency to the result
                result.append("Character: ").append(characters[i]).append(" Frequency: ").append(count).append("\n");
            }
        }

        // Convert the result string to an array of strings, splitting by newlines
        return result.toString().split("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calling the method to find the frequencies of characters
        String[] frequencies = findFrequency(inputString);

        // Displaying the result: Character frequencies
        System.out.println("Character Frequencies:");
        for (String frequency : frequencies) {
            // Skip empty strings in the result
            if (!frequency.isEmpty()) {
                System.out.println(frequency);  // Display each frequency
            }
        }

        scanner.close();  // Close the scanner to avoid resource leaks
    }
}
