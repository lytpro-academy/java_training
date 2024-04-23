package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);

        Date date = new Date();
        System.out.println(date);
    }
}
