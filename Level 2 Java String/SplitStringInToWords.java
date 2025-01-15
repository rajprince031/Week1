import java.util.Scanner;

//Create SplitStringInToWords to split the string into words and find the length of the corresponding word
public class SplitStringInToWords{
    
    public static void main(String[] agrs){

        //Create the object of the the class SplitStringInToWords
        SplitStringInToWords SplitStringInToWords = new SplitStringInToWords();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the string input
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        //Remove the spaces from the start and end using trim method
        str = str.trim();
        
        //Create the length variable and store the result return by calculateLength method
        int length = SplitStringInToWords.calculateLength(str);

        //Create a string array that store the word and length of word that return by splitString method
        String[] stringArray = SplitStringInToWords.splitString(str,length);
        
        //Take a loop to print all the words
        System.out.println("Printing the words present in the given string");

        for(int i=0;i<stringArray.length;i++){
            System.out.println(stringArray[i]);
        }

        // Close the scanner to prevent resource leak
        input.close();

    }

    //Create a method calculateLength to calculate the length of the string.
    public int calculateLength(String str){

        //Create a variable and initialize it zero to count the word in the string
        int counter = 0;

        try{
            //Take a loop to iterate over the string
            while(true){

                str.charAt(counter);
                //if the string is not empty then increase the counter variable
                counter++;
            }
        }catch(IndexOutOfBoundsException e){

            //if the error is occur means the string is end so return the counter variable
            return counter;
        }

    }


    //Create a method that use charAt method to split the string into words
    public String[] splitString(String str, int length){
        
        int counter = 0;

        //Take a loop to traverse the string
        for(int i=0;i<length;i++){

            // check the character of string is equal to space or not
            if(str.charAt(i)==' ' && str.charAt(i+1)==' '){
                continue;
            }
            else if(str.charAt(i) == ' '){
                counter++;
            } 
        }

        //Create a string array that store the word and length of word
        String[] stringArray = new String[counter+1];

        //Create a variable word that store the word
        String word = "";

        //Create a variable word that count the number of word store in the array
        int wordCount = 0;

        //Take a loop to traverse the string
        for(int i=0;i<length;i++){

            //Check if two spaces 
            if(str.charAt(i) == ' ' && str.charAt(i+1) == ' '){
                continue;
            }
            else if(str.charAt(i) != ' '){
                //break the work if str.charAt(i) is equal to space
                word = word + str.charAt(i); //store character one by one to word variable
            }else{
                //break the work if str.charAt(i) is equal to space and store in the array
                stringArray[wordCount] = word;
                word = ""; // update the word to blank 
                wordCount++; // increase the wordCount
            }
        }
        stringArray[wordCount] = word;

        return stringArray;//return the stringArray
    }

    
}