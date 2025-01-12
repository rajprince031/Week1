// Import Scanner to read user input
import java.util.Scanner;

// Create a class to find the youngest and the tallest among three friends
public class YoungestAndTallest {

    //Create a method that find the tallest friend among them
    public int findYoungest(int[] ages){
        // Variables to store the index of the youngest friend
        int youngestIndex = 0;

        // Loop through the arrays to find the youngest
        for (int i = 1; i < 3; i++) {
            // Find the youngest friend
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    //Create a method that find the youngest friend among them
    public int findTallest(double[] heights){
        // Variables to store the index of the Tallest friend
        int tallestIndex = 0;

        // Loop through the arrays to find the Tallest
        for (int i = 1; i < 3; i++) {
            
            // Find the tallest friend
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {

        //Create the object of YoungestAndTallest class
        YoungestAndTallest YoungestAndTallest = new YoungestAndTallest();

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Define arrays to store the ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for the age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of friend " + (i + 1) + ": ");
            ages[i] = input.nextInt(); // Read the age for each friend

            System.out.print("Enter the height of friend " + (i + 1) + ": ");
            heights[i] = input.nextDouble(); // Read the height for each friend
        }

        // Variables to store the index of the youngest and tallest friend
        int youngestIndex = YoungestAndTallest.findYoungest(ages);
        int tallestIndex = YoungestAndTallest.findTallest(heights);

        

        // Array of friends' names
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Display the youngest and tallest friends
        System.out.println("\nThe youngest friend is: " + friends[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex]);

        // Close the Scanner Object
        input.close();
    }
}
