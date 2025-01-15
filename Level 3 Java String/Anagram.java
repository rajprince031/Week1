import java.util.Scanner;

public class Anagram {

    // Check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;  // If lengths differ, they can't be anagrams
        }

        int[] freq1 = new int[256];  // Character frequency for text1
        int[] freq2 = new int[256];  // Character frequency for text2

        // Count character frequencies for both strings
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // Compare character frequencies
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;  // If any frequency doesn't match, they aren't anagrams
            }
        }

        return true;  // All frequencies match, so they are anagrams
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for two strings
        System.out.print("Enter the first string: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String text2 = scanner.nextLine();

        // Check and display the result
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
