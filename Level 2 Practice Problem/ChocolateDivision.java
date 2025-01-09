// Create ChocolateDivision class to divide chocolates among children
import java.util.Scanner;

class ChocolateDivision {
    public static void main(String[] args) {
        
        // Declare variables to store the number of chocolates and number of children
        int numberOfChocolates, numberOfChildren;
        int chocolatesPerChild, remainingChocolates;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the number of chocolates and children
        System.out.print("Enter the number of chocolates: ");
        numberOfChocolates = input.nextInt();
        
        System.out.print("Enter the number of children: ");
        numberOfChildren = input.nextInt();
        
        
        // Calculate the number of chocolates each child gets and the remaining chocolates
        chocolatesPerChild = numberOfChocolates / numberOfChildren;
        remainingChocolates = numberOfChocolates % numberOfChildren;
        
        // Print the results
        System.out.println("The number of chocolates each child gets is: " + chocolatesPerChild);
        System.out.println("The number of remaining chocolates are: " + remainingChocolates);
    }
}
