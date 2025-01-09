// Create CalculateUniversityFee class to calculate the fee of the student

public class CalculateUniversityFee {
    public static void main(String[] agrs){
    
    // Create a variable fee that indicates the fee of the student.
    int fee = 125000;

    // Create the variable discountPercent that indicates discount percentage.
    int discountPercent = 10;

    // Create the variable discount to compute the discount.
    int discount = (fee * discountPercent)/100;
    
    // Create the variable discountedFee to compute the fee after the discount applies.
    int discountedFee = fee - discount;

    //Print the discount and discountedFee
    System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR "+discountedFee);

    }
}