// Create CalculateTheProfitAndLoss class to calculate the profit and the loss
public class CalculateTheProfitAndLoss {
    public static void main(String[] agrs){

    // Create a variable costPrice and sellingPrice to indicate the cost price and selling price of INR.
    int costPrice = 129, sellingPrice = 191;

    // Create the variable profit to indicate the profit in INR.
    int profit = sellingPrice - costPrice;

    // Create the variable percentage to calculate the profit percentage in INR.
    float percentage = ((float)profit / costPrice) * 100;

    //Print the percentage
    System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+percentage);
    }
}
