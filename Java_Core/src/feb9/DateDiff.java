package feb9;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDiff {

    public static void main(String[] args) {
        // Get user input for dates
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date 1 (YYYY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter date 2 (YYYY-MM-DD): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        // Calculate the difference
        Period period = Period.between(date1, date2);

        // Print the difference in years, months, and days
        System.out.println("Difference:");
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }
}
