import java.util.Scanner;

//Create CountVowelsAndConsonant to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
public class CountVowelsAndConsonant{
    
    public static void main(String[] agrs){

        //Create the object of the the class CountVowelsAndConsonant
        CountVowelsAndConsonant CountVowelsAndConsonant = new CountVowelsAndConsonant();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the string input
        System.out.print("Enter the string: ");
        String str = input.next();
        

        //Create a variable str1 that store the result that return by convertLowerCase method
        String str1 = CountVowelsAndConsonant.convertLowerCase(str);

        //Create a int array that store the vowels and consonant count that return by findVowelsAndConsonants method
        int[] result = CountVowelsAndConsonant.findVowelsAndConsonants(str1);

        //Create two variable that stores the count of the vowels and consonants from the result array
        int vowels = result[0];
        int consonants = result[1];

        //print the result 
        System.out.printf("Total %d vowels and %d consonants are present in %s string.",vowels,consonants,str);
        
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
    public int[] findVowelsAndConsonants(String str){
        
        //Create two variable that stores the count of the vowels and consonants
        int vowels = 0;
        int consonants = 0;
        
        //Take a loop and check every character by their ascii value for vowels and consonants.
        for(int i=0;i<str.length();i++){

            //take a variable result that store the result from method checkCharacter
            String result = checkCharacter(str.charAt(i));

            //if character is vowels then increase the count of vowels 
            if(result == "Vowel"){
                vowels++;
            }else if(result == "Consonant"){
                //else again check if the character is consonants then, we increase the count of consonants.
                consonants++;
            }
        }

        //return the value of vowels and consonants in the form of array
        return new int[]{vowels, consonants};
        
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