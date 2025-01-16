import java.util.*;
public class VowelConsonantCounter {

    
    // Method to count the number of vowels and consonants in a given string.
    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase to simplify the vowel check
        str = str.toLowerCase();

        // Iterate over each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Check if the character is a vowel
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }

    public static void main(String[] args) {
        // Example usage
        Scanner input  = new Scanner(System.in);
        String word = input.next();
        System.out.println("Input String: " + word);
        countVowelsAndConsonants(word);
    }
}