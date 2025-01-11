// Create a FindTheFactors class to find the factors of the number.

import java.util.Scanner;

class FindTheFactors{

    public static void main(String[] agrs){
        //Create a Scanner Object
        Scanner input = new Scanner(System.in);

        //Create a variable number and take user input and store into it.
        System.out.print("Enter the number : ");
        int number = input.nextInt();

        //create integer variable maxFactor and initialize to 10
        int maxFactor = 10;

        //Create an integer array of name factors of size
        int[] factors = new int[maxFactor]; 

        //Create a index variable that count the factor of the array and initialize to 0
        int index = 0;

        //find the factor of the number using for loop and store to the factors array
        // run a loop from 1 to numbers
        for(int i = 1; i <= number; i++){ 

            // Check the number if it is divisible by i, if yes then store the i to the factors array
            if(number % i == 0){

                 //check the index, if it equal to the maxFactor then we reinitialize the maxFactor the double size
                if(index == maxFactor){

                    maxFactor = 2 * maxFactor;

                    //Create the array name temp array with size of maxFactor
                    int[] temp = new int[maxFactor];

                    //Run the loop from 1 to number and store the factor of the number to the array
                    for(int j = 0; j < factors.length; j++){

                        //Copy the factors array element to the temp array
                        temp[j] = factors[j];
                    }

                    factors = temp; //assign the temp array to the factors array;

                }

                factors[index] = i;
                index++; //increase the index value by 1

            }
        }
        
        //Traverse the array using loop and print the factors to the number
        for(int i = 0; i < index; i++){
            System.out.print(factors[i] + " "); 
        }
        // Close the Scanner Object
        input.close();

    }
}


