import java.util.Scanner;
//Creating the class
public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.trim();
//Calling the method 
        String reversedStr = reverseString(str);
        System.out.println("Reversed String: " + reversedStr);
    }
//method for reversing the string 
    public static String reverseString(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }
}