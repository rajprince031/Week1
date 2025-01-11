// Create a MultiplicationTable class to print a multiplication table of a number.

import java.util.Scanner;

class MultiplicationTable6To9{

    public static void main(String[] agrs){
        //Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        //Create a variable number and take user input and store into it.
        System.out.print("Enter the number : ");
        int number = input.nextInt();

        //Initialize an array of 4 integer number that store the table of given number 6 to 9
        int[] table = new int[4]; 

        //Calculate the table of number and store to the array table.
        for(int i=0; i<table.length; i++){
            table[i] = number * (6+i);
        }

        //Print the table using for loop with format number * i = ____
        for(int i=0; i<table.length; i++){

            System.out.println(number+" * "+(i+6)+" = "+table[i]);

        }

        // Close the Scanner Object
        input.close();

    }
}