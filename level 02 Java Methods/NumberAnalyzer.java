// Create a NumberAnalyzer class to check whether the number is positive, negative, even or odd.

import java.util.Scanner;

class NumberAnalyzer{

    //Create a method that check the number is even or odd
    public void isEven(int number){
        if(number % 2 == 0){
        //if the number is even, print this number is even
        System.out.println(number+" is an even");

        }else{
        //if the number is odd, print this number is odd
        System.out.println(number+" is an odd");
        }
    }

    //Create a method that check the number is positive or negative
    public void isPositive(int number){
        if(number > 0){

            //if the number is positive, call the isEven method
            isEven(number);
        
        }else if(number == 0){

            //if the number is Zero, print this number is Zero
            System.out.println(number+" is zero number");

        }else{

            //if the number is negative, print this number is negative
            System.out.println(number+" is a negative number");

        }
    }

    //Create a method that compare the two number
    public int compare(int num1, int num2){

        if(num1 > num2){

            //if num1 is greater than num2 return 1;
            return 1;

        }else if(num1 < num2){

            //if num1 is smaller than num2 return -1;
            return -1;

        }else{

            //if num1 is equal to num2 return 0;
            return 0;

        }
    }


    public static void main(String[] agrs){


        //Create the object of NumberAnalyzer class
        NumberAnalyzer NumberAnalyzer = new NumberAnalyzer();

        //Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        //Initialize an array of 5 integer number 
        int[] number = new int[5]; //Array to store the 5 integer value

        // Take user input for the numbers using for loop
        for(int i=0; i<number.length; i++){
            //Ask the user to enter the age of the student and store it to the array;
            System.out.print("Enter the number : ");
            number[i] = input.nextInt();
        }

        //Traverse the array and check the number one by one.
        for(int i=0; i<number.length; i++){

            //call the method isPositive to check the number is positive or not
            NumberAnalyzer.isPositive(number[i]);
        }

        //Create a variable result that store the value that return by compare method;
        int result = NumberAnalyzer.compare(number[0], number[number.length - 1]);

        
        if(result == 1){

            //if result == 1, print greater
            System.out.println("greater");

        }else if(result == -1){

            //if result == -1, print less
            System.out.println("less");

        }else{

            //if result == 1, print equal
            System.out.println("equal");

        }

        // Close the Scanner Object
        input.close();

    }
}