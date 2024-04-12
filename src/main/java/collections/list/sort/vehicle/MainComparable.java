package collections.list.sort.vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparable {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Car", "Toyota", 25000.0, 180));
        vehicles.add(new Vehicle("Car", "BMW", 45000.0, 220));
        vehicles.add(new Vehicle("Bike", "Honda", 12000.0, 160));
        vehicles.add(new Vehicle("Bike", "Harley Davidson", 35000.0, 200));

        // Sorting based on model (using Comparable)
        System.out.println("Sorted based on model:");
        Collections.sort(vehicles);
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}
