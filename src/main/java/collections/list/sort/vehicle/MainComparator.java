package collections.list.sort.vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparator {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Car", "Toyota", 25000.0, 180));
        vehicles.add(new Vehicle("Car", "BMW", 45000.0, 220));
        vehicles.add(new Vehicle("Bike", "Honda", 12000.0, 160));
        vehicles.add(new Vehicle("Bike", "Harley Davidson", 35000.0, 200));

        // Sorting based on price (using Comparator)
        System.out.println("Sorted based on price:");
        Collections.sort(vehicles, new VehiclePriceComparator());
        for (Vehicle v : vehicles) {
            System.out.println(v.getModel() + " - $" + v.getPrice());
        }

        // Sorting based on max speed (using Comparator)
        System.out.println("\nSorted based on max speed:");
        Collections.sort(vehicles, new VehicleMaxSpeedComparator());
        for (Vehicle v : vehicles) {
            System.out.println(v.getModel() + " - " + v.getMaxSpeed() + " km/h");
        }

        // Sorting based on type (using Comparator)
        System.out.println("\nSorted based on type:");
        Collections.sort(vehicles, new VehicleTypeComparator());
        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " - " + v.getModel());
        }
    }
}
