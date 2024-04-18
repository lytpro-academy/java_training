package date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateAgeExample {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date birthDate = dateFormat.parse("01-01-1990");
            Date currentDate = new Date();
            long diffInMillies = Math.abs(currentDate.getTime() - birthDate.getTime());
            long ageInYears = diffInMillies / (1000L * 60 * 60 * 24 * 365);
            System.out.println("Age: " + ageInYears + " years");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
