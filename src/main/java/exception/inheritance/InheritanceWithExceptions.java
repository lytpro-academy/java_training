package exception.inheritance;

public class InheritanceWithExceptions  {
    public static void main(String[] args) {
        Superclass obj = new Subclass(); // Upcasting to superclass reference

        try {
            obj.readFile(); // Calls overridden method in subclass
        } catch (java.io.IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }

        Subclass subObj = new Subclass();

        try {
            subObj.writeToDatabase(); // Calls method in subclass
        } catch (java.sql.SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }
}