// Create a StudentVoteChecker class to check whether the student can vote depending on his/her age being greater or equal to 18.

import java.util.Scanner;

class StudentVoteChecker {

    // Create a canStudentVote method that check the student can vote or not
    public boolean canStudentVote(int age) {
        if (age >= 18) {
            // age is greater than 18 or equal to 18, return true
            return true;

        } else {

            // age is smaller than 18 or negative, return false
            return false;
        }
    }

    // Create the method that generate the random value and store to the array
    public int[] generateRandomValue(int size) {

        // Initialize an array of integer elements
        int[] ages = new int[size]; // Array to store the ages of the students

        // Take loop that generate random 2 digit number
        for (int i = 0; i < size; i++) {

            ages[i] = (int) (Math.random() * (99 - (-99) + 1)) - 99;
        }

        // return the array
        return ages;
    }

    // Create a method that generate student record according to their age
    public String[][] generateStudentRecord(int[] ages) {

        // Initialize an 2D array of String elements that store the ages and voting
        // status.
        String[][] studentsRecord = new String[ages.length][2];

        // Traverse the ages array and check the age of every student one by one.
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                // if the age is negative and equal to 18, then store the invalid age
                studentsRecord[i][0] = String.valueOf(ages[i]);
                studentsRecord[i][1] = "invalid age";

            } else if (ages[i] >= 18) {
                // if the age is greater and equal to 18, then store the can vote in string
                // array
                studentsRecord[i][0] = String.valueOf(ages[i]);
                studentsRecord[i][1] = "can vote";
            } else {
                // if the age is smaller than 18, then store the cannot vote in string array
                studentsRecord[i][0] = String.valueOf(ages[i]);
                studentsRecord[i][1] = "cannot vote";
            }
        }

        // return the array
        return studentsRecord;

    }

    public static void main(String[] agrs) {

        // Create the object of FindTheRootOfTheEquation class
        StudentVoteChecker StudentVoteChecker = new StudentVoteChecker();

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Create a variable size and ask the user to enter the number of student
        System.out.print("Enter the number of student: ");
        int size = input.nextInt();

        // Initialize an array of 10 integer elements and store the array that return by
        // the generateRandomValue method
        int[] ages = StudentVoteChecker.generateRandomValue(10); // Array to store the ages of the 10 students

        String[][] studentRecord = StudentVoteChecker.generateStudentRecord(ages);

        System.out.println("Ages\tEligibility");
        // print the result using for loop
        for (int i = 0; i < size; i++) {
            System.out.println(studentRecord[i][0] + "\t" + studentRecord[i][1]);

        }
        // Close the Scanner Object
        input.close();

    }
}
