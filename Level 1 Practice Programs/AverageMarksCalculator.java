// Create AverageMarksCalculator class to calculate the average
// of marks in PCM.

public class AverageMarksCalculator {
    public static void main (String[] agrs){
        // Create a variable physics, chemistry and maths to indicate the marks obtained 
        // in Physics, Chemistry and Maths.
        int maths = 94, physics = 99, chemistry = 96;

        // Create the variable averageMark to calculte average marks in PCM.
        float averageMark = (maths+physics+chemistry)/3.0f;

        // Print the average marks of Sam.
        System.out.println("Sam’s average mark in PCM is "+averageMark);
    }
}
