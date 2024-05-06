package basics.cloing;

public class Address implements Cloneable {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    // Implementing clone method for deep copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}