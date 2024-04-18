package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifferenceExample {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date startDate = dateFormat.parse("01-01-2024");
            Date endDate = dateFormat.parse("18-04-2024");
            long difference = endDate.getTime() - startDate.getTime();
            long differenceInDays = difference / (1000 * 60 * 60 * 24);
            System.out.println("Difference in days: " + differenceInDays);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}