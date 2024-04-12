package collections.list.sort.vehicle;
import java.util.Comparator;

public class VehiclePriceComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return Double.compare(v1.getPrice(), v2.getPrice());
    }
}
