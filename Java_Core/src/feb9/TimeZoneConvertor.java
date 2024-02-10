package feb9;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZoneConvertor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input datetime
        System.out.print("Enter datetime (yyyy-MM-dd HH:mm:ss): ");
        String datetimeStr = scanner.nextLine();
        LocalDateTime datetime = LocalDateTime.parse(datetimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        // Input source timezone
        System.out.print("Enter source timezone (e.g., America/New_York): ");
        String sourceTimeZoneStr = scanner.nextLine();
        ZoneId sourceTimeZone = ZoneId.of(sourceTimeZoneStr);

        // Input target timezone
        System.out.print("Enter target timezone (e.g., Europe/London): ");
        String targetTimeZoneStr = scanner.nextLine();
        ZoneId targetTimeZone = ZoneId.of(targetTimeZoneStr);

        // Convert time
        ZonedDateTime sourceZonedDateTime = datetime.atZone(sourceTimeZone);
        ZonedDateTime targetZonedDateTime = sourceZonedDateTime.withZoneSameInstant(targetTimeZone);

        // Print converted time
        String convertedDatetimeStr = targetZonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Converted time: " + convertedDatetimeStr);

        scanner.close();
    }
}
/*
Sample data format for reference:-
Datetime: 2024-02-10 10:30:00
Source Timezone: America/New_York
Target Timezone: Europe/London

 */