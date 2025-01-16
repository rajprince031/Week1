import java.util.Scanner;
//Creating the class
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.trim(); // Removing extra spaces from the input
        
        // Calling the method to check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
    }

    // Method for checking if the string is a palindrome
    public static boolean checkPalindrome(String str) {
        int start = 0; // Starting index of the string
        int end = str.length() - 1; // Ending index of the string
        
        // Loop to compare characters from the beginning and end
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // If mismatch, the string is not a palindrome
            }
            start++; // Move to the next character from the start
            end--; // Move to the previous character from the end
        }
        return true; // If no mismatch found, the string is a palindrome
    }
}
