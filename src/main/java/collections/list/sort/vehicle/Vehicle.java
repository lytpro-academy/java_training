package collections.list.sort.vehicle;

public class Vehicle implements Comparable<Vehicle> {
    private String type;
    private String model;
    private double price;
    private int maxSpeed;

    // Constructor
    public Vehicle(String type, String model, double price, int maxSpeed) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    // Implementing Comparable interface
    @Override
    public int compareTo(Vehicle other) {
        // Compare based on the model name
        return this.model.compareTo(other.model);
    }

    // Getters
    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle [type=" + type + ", model=" + model + ", price=" + price + ", maxSpeed= "+maxSpeed;
    }
}
