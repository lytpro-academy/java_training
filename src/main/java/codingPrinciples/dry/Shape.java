package codingPrinciples.dry;

/**
 * Class representing a geometric shape
 * */
class Shape {
    protected double width;
    protected double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the shape
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate the perimeter of the shape
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

