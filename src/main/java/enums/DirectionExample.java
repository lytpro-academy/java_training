package enums;

public class DirectionExample {
    public static void main(String[] args) {
        String directionString = "North";

        // Convert the string to uppercase for case-insensitive comparison
        directionString = directionString.toUpperCase();

        boolean found = false;

        // Iterate over the Direction enum constants
        for (Direction direction : Direction.values()) {
            // Convert enum name to uppercase for comparison
            String enumName = direction.name();
            if (enumName.equals(directionString)) {
                found = true;
                System.out.println(directionString + " found in Direction enum.");
                break;
            }
        }

        if (!found) {
            System.out.println(directionString + " not found in Direction enum.");
        }
    }
}