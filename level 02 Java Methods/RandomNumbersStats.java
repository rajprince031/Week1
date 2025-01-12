import java.util.Scanner;

//Create a RandomNumbersStats class that generate random number and find the maximum, minimum and average of the number
public class RandomNumbersStats {
    
    //Create a generate4DigitRandomArray that generate the array of 4 digits random value
    public int[] generate4DigitRandomArray(int size){
        
        //Create a array that store the random value 
        int[] numbers = new int[size];

        //Take a loop to assign the random value to the array
        for(int i=0; i<size; i++){

            numbers[i] = (int)(Math.random() * 9000)+ 1000;

        }

        //return the array
        return numbers;
    }

    //Create the method the return the double array of minimum, maximum and average of the array
    public double[] findAverageMinMax(int[] numbers){
        //Create variable that store the maximum, minimum and average of the number
        double maximum, minimum, average;

        //Initialise maximum is numbers[0] is the minimum value 
        maximum = numbers[0];

        //Initialise minimum is numbers[0] is the minimum value 
        minimum = numbers[0];

        //Create a varaible totalSum and Initize it to 0.
        double totalSum = 0;

        //Take a loop to find the maximum, minimum and totalSum of the array
        for(int i = 0; i < numbers.length; i++){
            maximum = Math.max( maximum, numbers[i]); // compare the numbers[i] to the maximum and update the maximum

            minimum = Math.min( minimum, numbers[i]); // compare the numbers[i] to the minimum and update the minimum

            totalSum = totalSum + numbers[i]; // add the numbers to the totalSum and update the totalSum
        } 

        //Calculate the average and store it to the average
        average = totalSum/numbers.length;

        //return the value the maximum, minimum and average in the form of double array
        return new double[]{maximum,minimum,average};

    }
    
    public static void main(String[] agrs){
        //Create the object of RandomNumbersStats class
        RandomNumbersStats RandomNumbersStats = new RandomNumbersStats();

        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        //Create a variable name size and ask the user to take input
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();

        //Initize a array with name and call the method generate4DigitRandomArray that return the array
        int[] randomNumbers = RandomNumbersStats.generate4DigitRandomArray(size);

        //Create the double array and store the result
        double[] results =  RandomNumbersStats.findAverageMinMax(randomNumbers);

        //Print the value of the maximum, minimum and average 
        System.out.println("Maximum number : "+results[0]);
        System.out.println("Minimum number : "+results[1]);
        System.out.println("Average number : "+results[2]);
    }
}
