public class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            // This works with any Shape subclass through polymorphism
            // No type checking, no if-else statements needed
            totalArea += shape.getArea();
        }
        return totalArea;
    }
    public double calculateAverageArea(Shape[] shapes) {
        if (shapes.length == 0) return 0;
        return calculateTotalArea(shapes) / shapes.length;
    }
}
