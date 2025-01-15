import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each character

        // Loop through the string to populate the frequency array
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Count unique characters to determine the size of the 2D array
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Populate the 2D array with characters and their frequencies
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i); // Character
                result[index][1] = Integer.toString(frequency[i]); // Frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string to find the frequency of characters:");
        String input = scanner.nextLine();

        // Call the method to find character frequencies
        String[][] frequencies = findFrequency(input);

        // Display the result in a tabular format
        System.out.println("Character Frequency");
        System.out.println("Character   Frequency");
        for (String[] row : frequencies) {
            System.out.println(row[0] + "   " + row[1]);
        }

        scanner.close();
    }
}
