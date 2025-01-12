// Create a StudentVoteChecker class to check whether the student can vote depending on his/her age being greater or equal to 18.

import java.util.Scanner;

class StudentVoteChecker{

    //Create a canStudentVote method that check the student can vote or not
    public boolean canStudentVote(int age){
        if(age >= 18){
            //age is greater than 18 or equal to 18, return true
            return true;

        }else{

            //age is smaller than 18 or negative, return false
            return false;
        }
    }

    public static void main(String[] agrs){

        //Create the object of FindTheRootOfTheEquation class
        StudentVoteChecker StudentVoteChecker = new StudentVoteChecker();

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

            if(StudentVoteChecker.canStudentVote(ages[i])){
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
