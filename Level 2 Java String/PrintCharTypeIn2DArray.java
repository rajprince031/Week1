import java.util.Scanner;

//Create PrintCharTypeIn2DArray to find vowels and consonants in a string and display
public class PrintCharTypeIn2DArray{
    
    public static void main(String[] agrs){

        //Create the object of the the class PrintCharTypeIn2DArray
        PrintCharTypeIn2DArray PrintCharTypeIn2DArray = new PrintCharTypeIn2DArray();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the string input
        System.out.print("Enter the string: ");
        String str = input.next();
        

        //Create a variable str1 that store the result that return by convertLowerCase method
        String str1 = PrintCharTypeIn2DArray.convertLowerCase(str);

        //Create a int array that store the type of character that return by findVowelsAndConsonants method
        String[][] charType = PrintCharTypeIn2DArray.findVowelsAndConsonants(str1);

        //Print the characters and its type using for loop

        System.out.println("Character\ttype");
        for(int i=0;i<charType.length;i++){
            System.out.println(charType[i][0]+"\t"+charType[i][1]);

        }

        // Close the scanner to prevent resource leak
        input.close();

    }


    //Create a method that use charAt method to convert the string to lowerCase
    public String convertLowerCase(String str){

        //Create a new Str variable and assign to "";
        String newStr = "";
    
        //Take a loop that compare string using charAt method to convert string to lowercase
        for(int i=0;i<str.length();i++){

            //Create a variable and store the ascii value of character
            int asciiValue = str.charAt(i);

            //If the ascii is between the 97 and 122 then add 32 to convert into lowercase
            if(asciiValue >= 65 && asciiValue <= 90){
                newStr = newStr + (char)(asciiValue + 32);
            }else{
                //else simply add to string
                newStr = newStr + (char)(asciiValue);
            }
        }
        return newStr;//return the newStr
    }
    //Create a method that uses the charAt method to find the count of vowels and consonants.
    public String[][] findVowelsAndConsonants(String str){
        
        //Create a 2D array that stores the character and its type 
        String[][] charType = new String[str.length()][2];
        
        //Take a loop and check every character by their ascii value for vowels and consonants.
        for(int i=0;i<str.length();i++){

            //It Stores the character of the string
            charType[i][0] = Character.toString(str.charAt(i));

            //Check the character type using the checkCharacter method and store it into an array.
            charType[i][1] = checkCharacter(str.charAt(i));
        }

        //return the 2D array of charType
        return charType;
        
    }

    //Create a method that check the character is vowel, consonants or not a letter
    public String checkCharacter(char ch){
        //take a variable asciiValue that store the ascii value of the character
        int asciiValue = (int)ch;

        //if the ascii value of the character is equal to the 97, 101, 105, 111 and 117 then increase the count of vowels else we increase the count of consonants.
        if(asciiValue >= 97 && asciiValue <=122){
            if(asciiValue == 97 || asciiValue == 101 || asciiValue == 105 || asciiValue == 111 || asciiValue == 117){
                return "Vowel";
            }
            else{
                return "Consonant";
            }
        }
        return "Not a letter";
    }
    
}