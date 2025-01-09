// Create PenDistributor class to calcute the number of pens distribute to each student.

public class PenDistributor {
    public static void main(String[] agrs){
    
    // Create a variable pens and students to indicate the number of pens and students.
    int pens = 14, students = 3;

    // Create a varible calculatePenPerPerson to calcute the number of pens distribute to each student.
    int calculatePenPerPerson = pens / students;

    // Create a variable remainingPen to calculate the non-distributed pens;
    int remainingPen = pens % students;
    //Print the calculatePenPerPerson and remainingPen
    System.out.println("The Pen Per Student is "+calculatePenPerPerson+" and the remaining pen not distributed is "+remainingPen);


    }
}
