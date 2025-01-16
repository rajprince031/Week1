import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//Creating the class
public class DateArithmetic {
    public static void main(String[] args) {
        // Taking input from the user for the initial date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter a date (yyyy-MM-dd): ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String inputDate = input.nextLine();

        // Parsing the input date to LocalDate object
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Adding 7 days, 1 month, and 2 years to the date
        LocalDate newDate = date.plusDays(7)
                                .plusMonths(1)
                                .plusYears(2);

        // Subtracting 3 weeks from the new date
        newDate = newDate.minusWeeks(3);

        // Displaying the resulting date
        System.out.println("Resulting date after addition and subtraction: " + newDate);
    }
}
