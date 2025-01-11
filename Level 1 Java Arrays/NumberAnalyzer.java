// Create a NumberAnalyzer class to check whether the number is positive, negative or zero.

import java.util.Scanner;

class NumberAnalyzer{

    public static void main(String[] agrs){
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

            if(number[i] < 0){

                //if number is negative then, Print the number is negative
                System.out.println("The number "+number[i]+" is negative");

            }else if(number[i] > 0){

                //if number is positive then, Print the number is positive
                System.out.println("The number "+number[i]+" is positive");

                //check the positive number is even or odd
                if(number[i] % 2 == 0){

                    System.out.println("The number "+number[i]+" is even"); 

                }else{

                    System.out.println("The number "+number[i]+" is even"); 

                }

            }else{

                 //if number is Zero then, Print the number is Zero
                System.out.println("The number "+number[i]+" is Zero");
            }
        }

        //compare the first (number[0]) and last (number[number.length-1]) element of the array 
        if(number[0] > number[number.length - 1]){

            //if the first number is greater then last number, print greater
            System.out.println("greater");

        }if(number[0] < number[number.length - 1]){

            //if the first number is greater then last number, print greater
            System.out.println("less");

        }else{

            //if the first number is greater then last number, print greater
            System.out.println("equal");

        }

        // Close the Scanner Object
        input.close();

    }
}