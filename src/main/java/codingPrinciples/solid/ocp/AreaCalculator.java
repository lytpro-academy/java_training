package codingPrinciples.solid.ocp;

/**
AreaCalculator class responsible for calculating the total area of shapes
*/
 class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

