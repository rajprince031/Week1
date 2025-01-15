import java.util.Scanner;

//Create SplitInToWordsAndFindLength to split the string into words and find the length of the corresponding word
public class FindTheLongestAndShortestString{
    
    public static void main(String[] agrs){

        //Create the object of the the class FindTheLongestAndShortestString
        FindTheLongestAndShortestString FindTheLongestAndShortestString = new FindTheLongestAndShortestString();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the string input
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        //Remove the extra spaces from the start and end using trim method
        str = str.trim();
        
        //Create the length variable and store the result return by calculateLength method
        int length = FindTheLongestAndShortestString.calculateLength(str);

        //Create a string array that store the word and length of word that return by splitString method
        String[][] stringArray = FindTheLongestAndShortestString.splitString(str,length);
        
        //Create a String that store the longest and shortest string that return by searchLongestAndShortest method
        String[] longestAndShortestString = FindTheLongestAndShortestString.searchLongestAndShortest(stringArray);

        //Take a loop to print all the words and with its length
        for(int i=0;i<stringArray.length;i++){
            System.out.println("word : "+stringArray[i][0]+", "+"length : "+stringArray[i][1]);
        }

        //Print the longest and shortest string 
        System.out.println("The longest word: "+longestAndShortestString[0]);

        System.out.println("The shortest word: "+longestAndShortestString[1]);


        // Close the scanner to prevent resource leak
        input.close();

    }

    //Create a method calculateLength to calculate the length of the string.
    public int calculateLength(String str){

        //Create a variable and initialize it zero to count the word in the string
        int counter = 0;

        try{
            //Take a loop to iterate over the string
            while(str.charAt(counter) > 0){

                //if the string is not empty then increase the counter variable
                counter++;
            }
        }catch(IndexOutOfBoundsException e){

            //if the error is occur means the string is end so return the counter variable
            return counter;
        }


        //return the counter
        return counter;
    }


    //Create a method that use charAt method to split the string into words and counter the length of word
    public String[][] splitString(String str, int length){
        
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
        String[][] stringArray = new String[counter+1][2];

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
                stringArray[wordCount][0] = word;
                stringArray[wordCount][1] = String.valueOf(calculateLength(word));
                word = ""; // update the word to blank 
                wordCount++; // increase the wordCount
            }
        }
        stringArray[wordCount][0] = word;
        stringArray[wordCount][1] = String.valueOf(calculateLength(word));
        return stringArray;//return the stringArray
    }

    //Create the method that return the array longest and shortest word
    public String[] searchLongestAndShortest(String[][] strArray){

        //Create the maxLength that stores the first element length of the array.
        int maxLength = Integer.parseInt(strArray[0][1]);

        //Create the longestWord that stores the first string of the array.
        String longestWord = strArray[0][0];

        //Create the minLength that stores the first element length of the array.
        int minLength = Integer.parseInt(strArray[0][1]);

        //Create the shortestWord that stores the first string of the array.
        String shortestWord = strArray[0][0];

        for(int i=0; i<strArray.length;i++){

            //compare the length of the word with another array element if greater update the maxLength and longestWord
            if(maxLength < Integer.parseInt(strArray[i][1])){
                maxLength = Integer.parseInt(strArray[i][1]);
                longestWord = strArray[i][0];
            }


            //compare the length of the word with another array element if smaller update the minLength and shortestWord
            if(minLength > Integer.parseInt(strArray[i][1])){
                minLength = Integer.parseInt(strArray[i][1]);
                shortestWord = strArray[i][0];
            }
        }

        //return the value of longestWord and shortestWord in the form array
        return new String[]{longestWord, shortestWord};

    }

    
}