package enums;

public enum Planet {
    MERCURY(0.33), VENUS(0.72), EARTH(1.0), MARS(0.53), JUPITER(11.2), SATURN(9.41), URANUS(4.0), NEPTUNE(3.88);

    private final double mass; // relative to Earth's mass

    Planet(double mass) {
        this.mass = mass;
    }

    public double getMassRelativeToEarth() {
        return mass;
    }
}
