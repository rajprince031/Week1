import java.util.Scanner;

public class CompareTwoSubString {

    public static void main(String[] args) {

        // Create the object of the the class CompareTwoSubString
        CompareTwoSubString CompareTwoSubString = new CompareTwoSubString();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask for the string input
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        // Ask for the starting index input
        System.out.print("Enter the starting index: ");
        int start = input.nextInt();

        // Ask for the ending index input
        System.out.print("Enter the ending index: ");
        int end = input.nextInt();


        // handle StringOutOfBound Exception
        try {
            //generate the string using generateSubString
            String str1 = CompareTwoSubString.generateSubString(str, start, end);

            //generate the string using inbuilt method
            String str2 =  str.substring(start, end);

            //Create a variable isEqual and store the result
            boolean isEqual = str1.equals(str2);

            //check the result
            if(isEqual){
                System.out.println("Substring for this String is :"+str1);
                System.out.println("Both method are giving same result");
            }else{
                System.out.println("Both method are giving different result");
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch any other NumberFormatException
            System.out.println("Error: Invalid input. Please enter a valid index.");
        } catch (RuntimeException e) {
            // Catch any other RuntimeException
            System.out.println("A runtime exception occurred: " + e.getMessage());
        }

    }


    //Method to generate a substring
    public String generateSubString(String str, int start, int end){
        // This will throw a StringOutOfBoundExpection if the index is not a valid

        //Create a variable substr
        String substr = "";

        //generate the substring using loop
        for(int i = start; i < end; i++){

            //Add a character to the substr and update the value of substr
            substr = substr + str.charAt(i);

        }

        return substr;

    }

}