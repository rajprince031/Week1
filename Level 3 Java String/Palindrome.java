import java.util.Scanner;

public class Palindrome {

    // Check if the string is a palindrome using an iterative approach
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;  // If characters don't match, it's not a palindrome
            }
            start++;  // Move towards the middle
            end--;    // Move towards the middle
        }
        return true;  // All characters match, it's a palindrome
    }

    // Check if the string is a palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;  // Base case: All characters matched
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;  // Characters at the ends don't match
        }

        return isPalindromeRecursive(text, start + 1, end - 1);  // Check the next pair of characters
    }

    // Check if the string is a palindrome by reversing the string
    public static boolean isPalindromeUsingArray(String text) {
        char[] originalArray = text.toCharArray();  
        char[] reverseArray = new char[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - i - 1];
        }

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;  // If the characters don’t match, it’s not a palindrome
            }
        }
        return true;  // If they match, it’s a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Prepare the input for case-insensitive comparison
        inputText = inputText.replaceAll("\\s", "").toLowerCase();

        // Check if the string is a palindrome using different methods
        boolean resultIterative = isPalindromeIterative(inputText);
        boolean resultRecursive = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        boolean resultArray = isPalindromeUsingArray(inputText);

        // Output the results
        System.out.println("Palindrome check using iterative method: " + resultIterative);
        System.out.println("Palindrome check using recursive method: " + resultRecursive);
        System.out.println("Palindrome check using character arrays: " + resultArray);

        scanner.close();
    }
}
