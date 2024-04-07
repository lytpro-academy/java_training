package codingPrinciples.solid.ocp;

/**
Main class to demonstrate Open/Closed Principle (OCP)

Open/Closed Principle (OCP) Example
This program demonstrates OCP by showing how new shapes can be added without modifying existing code.

 Explanation
 •	In thexample, we have an interface Shape representing different shapes with a method calculateArea() to calculate the area of the shape.
 •	We have classes Rectangle and Circle implementing the Shape interface. These classes are closed for modification because their behavior is fixed, but they are open for extension because new shapes can be added by implementing the Shape interface.
 •	The AreaCalculator class is responsible for calculating the total area of shapes. It accepts an array of Shape objects and iterates over them to calculate the total area. This class is also closed for modification because it doesn't need to change when new shapes are added; it's open for extension because it can work with any shape that implements the Shape interface.
 •	Finally, the OCPExample class demonstrates how the AreaCalculator class can calculate the total area of different shapes without modifying its source code. This shows adherence to the Open/Closed Principle (OCP).
*/
public class OCPExample {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(5, 4),
                new Circle(3)
        };

        AreaCalculator areaCalculator = new AreaCalculator();
        double totalArea = areaCalculator.calculateTotalArea(shapes);
        System.out.println("Total area of shapes: " + totalArea);
    }
}

