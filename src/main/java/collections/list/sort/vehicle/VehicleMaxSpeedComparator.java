package collections.list.sort.vehicle;
import java.util.Comparator;

public class VehicleMaxSpeedComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return Integer.compare(v1.getMaxSpeed(), v2.getMaxSpeed());
    }

}