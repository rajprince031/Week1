
// Creating a class named PurchaseCalculator to calculate the total price of an item
import java.util.Scanner;

class PurchaseCalculator {
    public static void main(String[] args) {
        
        // Declare variables for unit price and quantity, both will be input by the user
        double unitPrice;
        int quantity;
        
        // Declare a variable to store the total price after calculation
        double totalPrice;
        
        // Create a Scanner object to take user input from the keyboard
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the unit price of the item
        System.out.print("Enter the unit price of the item (in INR): ");
        
        // Take the unit price as input and store it in the unitPrice variable
        unitPrice = input.nextDouble();
        
        // Ask the user to enter the quantity of the item to be purchased
        System.out.print("Enter the quantity to be purchased: ");
        
        // Take the quantity as input and store it in the quantity variable
        quantity = input.nextInt();
        
        // Calculate the total price by multiplying unit price and quantity
        totalPrice = unitPrice * quantity;
        
        // Print the totalPrice and unitPrice
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
