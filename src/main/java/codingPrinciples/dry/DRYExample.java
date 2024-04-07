package codingPrinciples.dry;

/**
 * Main class to demonstrate DRY (Don't Repeat Yourself)
 * Explanation:
 * •	In this example, we have a Shape class representing a geometric shape with width and height properties.
 * •	The Shape class contains methods to calculate both the area (calculateArea()) and perimeter (calculatePerimeter()) of the shape.
 * •	The Rectangle and Square classes extend the Shape class. They inherit the calculateArea() and calculatePerimeter() methods without duplicating the code.
 * •	By defining common functionality in the Shape class and reusing it in subclasses, we adhere to the DRY principle. This avoids repeating the implementation of area and perimeter calculations in each shape class, promoting code reuse and maintainability.
 * •	In the main method, we demonstrate how Rectangle and Square objects can utilize the common functionality defined in the Shape class without redundancy, thus following the DRY principle.
 */
public class DRYExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());

        Square square = new Square(5);
        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Perimeter of square: " + square.calculatePerimeter());
    }
}

