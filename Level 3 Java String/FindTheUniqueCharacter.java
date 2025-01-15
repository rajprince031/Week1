import java.util.Scanner;

//Create LengthOfTheString class to find the unique character in the string
public class FindTheUniqueCharacter {

    public static void main(String[] agrs) {

        // Create the object of the the class FindTheUniqueCharacter
        FindTheUniqueCharacter FindTheUniqueCharacter = new FindTheUniqueCharacter();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the string input
        System.out.print("Enter the string: ");
        String str = input.next();

        // Create the length variable and store the result return by calculateLength method
        int length = FindTheUniqueCharacter.calculateLength(str);

        //Create a character array that store the unique character return by generateUniqueArray method
        char[] uniqueArray = FindTheUniqueCharacter.generateUniqueArray(str, length);

        // print the result
        FindTheUniqueCharacter.displayArray(uniqueArray, str);

        // Close the scanner to prevent resource leak
        input.close();

    }

    // Create a method calculateLength to calculate the length of the string.
    public int calculateLength(String str) {

        // Create a variable and initialize it zero to count the word in the string
        int counter = 0;

        try {
            // Take a loop to iterate over the string
            while (true) {

                str.charAt(counter);
                // if the string is not empty then increase the counter variable
                counter++;
            }
        } catch (IndexOutOfBoundsException e) {

            // if the error is occur means the string is end so return the counter variable
            return counter;
        }
    }

    // Create the method that return the array of unique character
    public char[] generateUniqueArray(String str, int length) {

        //Create a tempArray of size length that store that unique character
        char[] tempArray = new char[length];
        //Create a index variable that count the number of unique character store in the temp array
        int index = 0;

        //Take a loop to find the unique character in the string str
        for (int i = 0; i < length; i++) {

            //Create a count variable that count the frequency of the character
            int count = 0;

            //Create a ch variable that store the character value of index i
            char ch = str.charAt(i);

            //Take another loop to count the frequency of ch characters.
            for (int j = 0; j < length; j++) {

                // if ch is equal to the current character increase the value of count by 1.
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            //if count == 1 means the character is unique
            if (count == 1) {

                //Store the unique character to the temp array 
                tempArray[index] = ch;

                //after the store the character increase the index value by 1
                index++;
            }
        }

        //Create a uniqueArray of size index
        char[] uniqueArray = new char[index];

        //Copy all the character that store in tempArray to unique array up to index value using loop
        for (int i = 0; i < index; i++) {
            uniqueArray[i] = tempArray[i];
        }

        //finally return the uniqueArray
        return uniqueArray;

    }

    // Create a method that display the unique array
    public void displayArray(char[] uniqueArray, String str) {

        System.out.printf("The unique character present in String %s\n", str);
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }

}