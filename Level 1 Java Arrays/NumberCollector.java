
// Create a NumberCollector class to check if the user entered 0 or a negative number to break the loop else store to the and and calculate the sum

import java.util.Scanner;

class NumberCollector{

    public static void main(String[] agrs){
        //Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        //Initialize an array of 10 integer elements
        double[] numbers = new double[10]; //Array to store the number that enter the user

        //Create a variable counter that count the number of input that user take
        int counter = 0; // and initialise it to 0.

        //Take the while loop that ask the input from user and check if the negative and zero or reach the limit of array we break the while loop
        while(true){
            
            //Create a variable nums to store the user input
            System.out.print("Enter the number : ");
            double nums = input.nextDouble();

            //check if the number is zero or negative or reach the array limit, if yes the break the loop
            if(nums == 0 || nums < 0 || counter == 10){
                break; // break the loop
            }else{
    
                //if the number is other than 0 and negative then assign to the array
                numbers[counter] = nums;

            }

            counter++; //At end we increase the counter variable by 1;
        }

        //Create a variable totalSum that stores the sum of all stored variables.
        double totalSum = 0;

        //Traverse the array from 0 to counter and add to the number that store in the array to the totalSum
        for(int i=0; i<counter; i++){

            totalSum = totalSum + numbers[i]; // It add the number value to the totalSum and update the value of totalSum

        }

        //Print the value totalSum
        System.out.println("The total value : "+totalSum);
        // Close the Scanner Object
        input.close();

    }
}

