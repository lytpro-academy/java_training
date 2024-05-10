package enums;

public class EnumDaySwitchExample {
    public static void printDay(Day day) {
        switch(day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        printDay(Day.MONDAY);
        printDay(Day.WEDNESDAY);
    }
}
