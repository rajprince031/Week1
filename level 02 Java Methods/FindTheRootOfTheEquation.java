import java.util.Scanner;

//Create a FindTheRootOfTheEquation class to find the root of the equation
public class FindTheRootOfTheEquation {
    
    //Create a calculateTheRoots method to return the array that contain root of the equation
    public double[] calculateTheRoots(double a, double b, double c){
        
        //Calculate the delta by formula delta = b^2 + 4*a*c
        double delta = Math.pow(b,2) + 4 * a * c;

        //Create a array of size of two that store the root of the equation
        double[] roots;

        //if delta is positive
        if(delta > 0){
            //Calculate the both root and store to the root1 and root2 variable;
            double root1 = ( - b + Math.sqrt(delta)) / (2 * a);
            double root2 = ( - b - Math.sqrt(delta)) / (2 * a);
            
            //Assign the root value to the array
            roots = new double[]{root1,root2};
        }else if(delta == 0){

            //if the delta is 0, then both root are same using formula root of x = -b/(2*a)
            double root = - b / ( 2 * a);

            //Assign the root value to the array
            roots = new double[]{root};


        }else{

            //if the delta is negative return empty array;
            roots = new double[]{};
        }

        return roots;


    }

    
    public static void main(String[] agrs){
        //Create the object of FindTheRootOfTheEquation class
        FindTheRootOfTheEquation FindTheRootOfTheEquation = new FindTheRootOfTheEquation();

        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        //Create variable a, b and c and ask the input from the user
        System.out.print("Enter the value of a : ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b : ");
        double b = input.nextDouble();


        System.out.print("Enter the value of c : ");
        double c = input.nextDouble();


        //Call the function that return the roots of the equation and store it to the double array
        double[] roots = FindTheRootOfTheEquation.calculateTheRoots(a, b, c);

        if(roots.length == 2){
            //If the size of roots is two, it means delta is positive and there is two root of the equation
            System.out.println("The first root is "+roots[0]+" second root is "+roots[1]);
        }else if(roots.length == 1){
            //If the size of roots is one, it means delta is zero and there is only one root of the equation
            System.out.println("The first root is "+roots[0]+" second root is "+roots[1]);
        }else{
            //If the size of roots is zero, it means delta is negative and print nothing
            System.out.println("Delta is negative for this equation, there are no roots for this equation");
        }
    }
}
