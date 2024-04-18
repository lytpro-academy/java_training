package date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneExample {
    public static void main(String[] args) {
        // Get the current time for Berlin time zone
        ZoneId berlinZone = ZoneId.of("Europe/Berlin");
        ZonedDateTime berlinTime = ZonedDateTime.now(berlinZone);

        // Get the current time for New York time zone
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkTime = ZonedDateTime.now(newYorkZone);

        // Format the times for display
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Display the times
        System.out.println("Berlin Time: " + berlinTime.format(formatter));
        System.out.println("New York Time: " + newYorkTime.format(formatter));

        // Calculate the difference in hours between Berlin and New York
        int hourDifference = berlinTime.getHour() - newYorkTime.getHour();
        System.out.println("Time difference between Berlin and New York: " + hourDifference + " hours");
    }
}