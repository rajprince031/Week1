import java.util.Scanner;

public class CharacterFrequency {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        boolean[] visited = new boolean[256];  // To track visited characters based on ASCII values
        StringBuilder uniqueChars = new StringBuilder();

        // Iterate through each character and add unique ones
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!visited[currentChar]) {
                visited[currentChar] = true;
                uniqueChars.append(currentChar);
            }
        }
        return uniqueChars.toString().toCharArray();  // Return unique characters as an array
    }

    // Method to calculate frequency of characters and store in a 2D array
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];  // Array to store frequency of characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Get the unique characters in the string
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];  // 2D array to store results

        // Store each unique character and its frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);  // Character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);  // Frequency
        }

        return result;  // Return the result array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the frequency of characters
        String[][] frequencies = findFrequency(inputString);

        // Display the frequency of each character
        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("Character: " + frequencies[i][0] + " Frequency: " + frequencies[i][1]);
        }

        scanner.close();  // Close the scanner to prevent resource leaks
    }
}
