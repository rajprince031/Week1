// Create CalculateUniversityFee class to calculate the fee of the student
import java.util.Scanner;

class FeeDiscountCalculator {
    public static void main(String[] args) {
        
        // Create a variable fee that indicates the fee of the student.
        double fee;
        
        // Create a double variable discountPercent that indicates discount percentage.
        double discountPercent;
        
        // Create a double variable discount to store the calculated discount amount
        double discount;
        
        // Create a double variable finalFee to store the final discounted fee
        double discountedFee;
        
        // Create a Scanner object to take user input from Standard Input (keyboard)
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the student fee
        System.out.print("Enter student fee (INR): ");
        
        // Take input from the user and store it in fee
        fee = input.nextDouble();
        
        // Prompt the user to enter the discount percentage
        System.out.print("Enter university discount percentage: ");
        
        // Take input from the user and store it in discountPercent
        discountPercent = input.nextDouble();
        
        // Calculate the discount amount using the formula: discount = (fee * discountPercent) / 100
        discount = (fee * discountPercent) / 100;
        
        // Compute the fee after the discount applies and store it to the variable discountedFee.
        discountedFee = fee - discount;
        
        //Print the discount and discountedFee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}