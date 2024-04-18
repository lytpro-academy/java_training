package enums;

public class DayExample {
    public static void main(String[] args) {
        // Accessing the name using getName() method
        Day day = Day.MONDAY;
        System.out.println("Name of the day: " + day.getName());

        // Accessing the name directly using name() method
        System.out.println("Name of the day: " + day.name());

        compareDays(Day.FRIDAY);
    }

    private static void compareDays(Day day) {
        if (day == Day.FRIDAY) {
            System.out.println(day.getName() + " is the same as " + Day.FRIDAY);
        } else {
            System.out.println(day + " is not the same as " + Day.FRIDAY);
        }
    }
}
