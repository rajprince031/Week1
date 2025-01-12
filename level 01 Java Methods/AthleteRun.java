import java.util.Scanner; 

// Creating a class named AthleteRun to calculate the number of rounds of Athlete
class AthleteRun {
    //Create a method name calculateAthleteRounds to calculate the distance covered by Athlete.
    public double calculateAthleteRounds(double side1, double side2, double side3){
        // Total distance the athlete needs to run in meters (5 km = 5000 meters)
        double totalDistance = 5000;

        //Create a variable name perimeter Calculate the perimeter of the triangle (sum of all three sides)
        double perimeter = side1 + side2 + side3;

        //Create a variable name rounds to calculate the number of rounds needed to complete 5 km
        double rounds = totalDistance / perimeter;

        //return the rounds
        return rounds;

    }
    public static void main(String[] args) {

        //Create the object of AthleteRun class
        AthleteRun AthleteRun = new AthleteRun();
        
        // Declare variables to store the sides of the triangle and other calculations
        double side1, side2, side3, rounds;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to input the sides of the triangle in meters
        System.out.print("Enter the length of side 1 (in meters): ");
        side1 = input.nextDouble();
        
        System.out.print("Enter the length of side 2 (in meters): ");
        side2 = input.nextDouble();
        
        System.out.print("Enter the length of side 3 (in meters): ");
        side3 = input.nextDouble();
        
        // Calculate the rounds using calculateAthleteRounds method

        rounds = AthleteRun.calculateAthleteRounds(side1, side2, side3);//call the method and pass the argument to calculate the number of rounds
        
        // Round up the number of rounds to the nearest whole number
        rounds = Math.ceil(rounds);
        
        // Display the total number of rounds the athlete must run to complete 5 km
        System.out.println("The total number of rounds the athlete will run is " + (int)rounds);
    }
}


