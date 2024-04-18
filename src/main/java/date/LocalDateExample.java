package date;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        // Create a LocalDate object representing today's date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // Create a LocalDate object for a specific date
        LocalDate christmas = LocalDate.of(2024, Month.DECEMBER, 25);
        System.out.println("Christmas Date: " + christmas);

        // Get the year, month, and day from a LocalDate object
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day);

        // Add or subtract days, months, or years
        LocalDate futureDate = today.plusDays(7).plusMonths(1).plusYears(1);
        System.out.println("Future Date: " + futureDate);

        // Check if a date falls before or after another date
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Is tomorrow after today? " + tomorrow.isAfter(today));

        // Compare two dates
        LocalDate date1 = LocalDate.of(2024, Month.JANUARY, 1);
        LocalDate date2 = LocalDate.of(2024, Month.DECEMBER, 31);
        System.out.println("Is date1 before date2? " + date1.isBefore(date2));

        // Check for leap year
        int yearToCheck = 2024;
        System.out.println("Is " + yearToCheck + " a leap year? " + LocalDate.ofYearDay(yearToCheck, 1).isLeapYear());
    }
}
