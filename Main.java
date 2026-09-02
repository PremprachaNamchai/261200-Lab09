public class Main {
    public static void main(String[] args) {
        System.out.println("=== OCP (Open/Closed Principle) Lab Demonstration ===\n");
        
        // Create various shapes
        Shape[] shapes = new Shape[]{
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 8),
            new Circle(3),
            new Rectangle(2, 5)
        };
        
        // Use AreaCalculator - notice it doesn't care about shape types
        AreaCalculator calculator = new AreaCalculator();
        
        System.out.println("Shape Areas:");
        System.out.println("Circle (r=5): " + String.format("%.2f", shapes[0].getArea()));
        System.out.println("Rectangle (4x6): " + String.format("%.2f", shapes[1].getArea()));
        System.out.println("Triangle (base=3, h=8): " + String.format("%.2f", shapes[2].getArea()));
        System.out.println("Circle (r=3): " + String.format("%.2f", shapes[3].getArea()));
        System.out.println("Rectangle (2x5): " + String.format("%.2f", shapes[4].getArea()));
        
        System.out.println("\n--- AreaCalculator Results ---");
        double totalArea = calculator.calculateTotalArea(shapes);
        double averageArea = calculator.calculateAverageArea(shapes);
        
        System.out.println("Total Area: " + String.format("%.2f", totalArea));
        System.out.println("Average Area: " + String.format("%.2f", averageArea));
        
        System.out.println("\n=== OCP Demonstration ===");
        System.out.println("Notice: We can add new shapes (like Hexagon, Pentagon) without");
        System.out.println("modifying the AreaCalculator class. It's CLOSED for modification");
        System.out.println("but OPEN for extension through polymorphism!");
    }
}
