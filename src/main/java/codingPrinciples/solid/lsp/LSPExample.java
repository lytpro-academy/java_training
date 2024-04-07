package codingPrinciples.solid.lsp;

/**
 * Main class to demonstrate Liskov Substitution Principle (LSP)
 * Explanation:
 * •In this example, we have a superclass Rectangle with width and height properties and methods to get area.
 * •We have a subclass Square which extends Rectangle, but it overrides setWidth and setHeight methods to maintain the square property where width and height are always the same.
 * •The calculateArea method demonstrates LSP by accepting objects of Rectangle class but works correctly with objects of Square class as well. This is because Square is substitutable for Rectangle, and the program's correctness is not affected by using Square instead of Rectangle.
 * */
public class LSPExample {
    // Method to calculate area of shapes
    public static int calculateArea(Rectangle rectangle) {
        return rectangle.getArea();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Square square = new Square(5);

        // Calculate area of rectangle
        System.out.println("Area of rectangle: " + calculateArea(rectangle));

        // Calculate area of square
        System.out.println("Area of square: " + calculateArea(square));
    }
}

