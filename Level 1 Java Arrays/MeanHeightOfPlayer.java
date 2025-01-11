// Create a MeanHeightOfPlayer class to calculate the mean height of the player.

import java.util.Scanner;

class MeanHeightOfPlayer{

    public static void main(String[] agrs){
        //Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        //Initialize an array of 11 number that store the height of the players 
        double[] players = new double[11]; 

        //Calculate the table of number and store to the array table.
        for(int i=0; i<players.length; i++){
            //take user height of the player input from the user and assign to the array.
            System.out.print("Enter the height of the player : ");
            players[i] = input.nextInt();
        }

        //Create a variable totalSum that stores the sum height of all players.
        double totalSum = 0;

        //Traverse the array using a for loop to calculate the sum height of all players.
        for(int i=0; i<players.length; i++){

            totalSum = totalSum + players[i]; // It add the number value to the totalSum and update the value of totalSum

        }

        //Create the variable meanOfHeight that calculates the mean of height of all Players.
        double meanOfHeight = totalSum / 11;

        //print the meanOfHeight
        System.out.println("The mean height of the football team" + meanOfHeight);

        // Close the Scanner Object
        input.close();

    }
}
