package date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDateExample {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = "18-04-2024";
        try {
            Date parsedDate = dateFormat.parse(dateString);
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
