import java.util.Scanner;
//Creating the class
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.trim(); // Removing extra spaces from the input

        // Calling the method to find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[256]; // Array to store frequency of each character (ASCII size)
        int maxFrequency = 0; // To track the highest frequency
        char mostFrequentChar = '\0'; // To store the most frequent character

        // Loop to count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at index i
            frequency[ch]++; // Increment the frequency of the character
        }

        // Loop to find the character with the highest frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at index i
            if (frequency[ch] > maxFrequency) {
                maxFrequency = frequency[ch]; // Update max frequency
                mostFrequentChar = ch; // Update most frequent character
            }
        }

        return mostFrequentChar; // Return the most frequent character
    }
}
