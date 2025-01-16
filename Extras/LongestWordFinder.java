import java.util.Scanner;
//Creating the class
public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        sentence = sentence.trim(); // Removing extra spaces from the input
        
        // Calling the method to find the longest word
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word in the sentence is: " + longestWord);
    }

    // Method for finding the longest word in the sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" "); // Splitting the sentence into words
        String longestWord = ""; // To store the longest word found

        // Loop to iterate through the words
        for (String word : words) {
            if (word.length() > longestWord.length()) { // Check if the current word is longer
                longestWord = word; // Update the longest word
            }
        }
        return longestWord; // Return the longest word
    }
}
