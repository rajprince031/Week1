// Create an OddEvenNumberSeparator class to separate the even and odd numbers.

import java.util.Scanner;

class OddEvenNumberSeparator{

    public static void main(String[] agrs){
        //Create a Scanner Object
        Scanner input = new Scanner(System.in);

        //Create a variable number and take user input and store into it.
        System.out.print("Enter the number : ");
        int number = input.nextInt();

        //check the number is natural number or not
        if(number < 0) {

            // if the number is not a natural number then exit the program
            System.out.println("Enter value are not a natural number");
            System.exit(0);

        }

        //Create an integer array for even and odd numbers with size = number / 2 + 1
        int[] evenArray = new int[number / 2 + 1]; 
        int[] oddArray = new int[number / 2 + 1]; 

        //Create index variables for odd and even numbers and initialize them to zero
        int oddIndex = 0, evenIndex = 0;
        for(int i = 1; i <= number; i++){
            //if the number is even then assign to the even array else assign to the odd
            if(i % 2 == 0){

                evenArray[evenIndex] = i; //Assign the even number to the even array
                evenIndex++; //After assigning the value increase the evenIndex variable by 1;

            }else{

                oddArray[oddIndex] = i; //Assign the even number to the odd array
                oddIndex++; //After assigning the value increase the oddIndex variable by 1

            }
        }

        //Traverse the array and print the value
        for(int i = 0; i < evenIndex; i++){
            System.out.print(evenArray[i]+" "); 
        }

        System.out.println();//change the line

        for(int i = 0; i < oddIndex; i++){
            System.out.print(oddArray[i] + " "); 
        }
        // Close the Scanner Object
        input.close();

    }
}


