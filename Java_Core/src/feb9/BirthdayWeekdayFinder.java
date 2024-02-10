package feb9;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class BirthdayWeekdayFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input date of birth
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dobStr = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobStr);

        // Calculate weekday of birth
        DayOfWeek weekdayOfBirth = dob.getDayOfWeek();
        System.out.println("Weekday of birth: " + weekdayOfBirth);

        // Calculate next birthday
        LocalDate nextBirthday = calculateNextBirthday(dob);
        System.out.println("Next birthday: " + nextBirthday);

        scanner.close();
    }

    public static LocalDate calculateNextBirthday(LocalDate dob) {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        LocalDate nextBirthday = dob.withYear(year);

        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.withYear(year + 1);
        }

        return nextBirthday;
    }
}
