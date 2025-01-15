import java.util.Scanner;

public class NonRepeat {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256]; // Frequency array for characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // No non-repeating character
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string to find the first non-repeating character:");
        String input = scanner.nextLine();

        // Find and display the result
        char result = findFirstNonRepeating(input);
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        scanner.close();
    }
}
