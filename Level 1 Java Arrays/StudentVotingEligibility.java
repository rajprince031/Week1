// Create a StudentVotingEligibility class to check whether the student can vote depending on his/her age being greater or equal to 18.

import java.util.Scanner;

class StudentVotingEligibility{

    public static void main(String[] agrs){
        //Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        //Initialize an array of 10 integer elements and take user input for the student's age. 
        int[] ages = new int[10]; //Array to store the ages of the 10 students

        // Take user input for the ages of 10 students using for loop
        for(int i=0; i<ages.length; i++){
            //Ask the user to enter the age of the student and store it to the array;
            System.out.print("Enter the age of the student : ");
            ages[i] = input.nextInt();
        }

        //Traverse the array and check the age of every student one by one.
        for(int i=0; i<ages.length; i++){

            if(ages[i] < 0){

                //Validate the age if age is negative then, Print Invalid age
                System.out.println("Invalid Age");

            }else if(ages[i] >= 18){
                //if the age is greater and equal to 18, print
                System.out.println("The student with the age "+ages[i]+" can vote.");

            }else{
                //if the age is greater and equal to 18, print
                System.out.println("The student with the age "+ages[i]+" cannot vote.");
            }
        }

        // Close the Scanner Object
        input.close();

    }
}
