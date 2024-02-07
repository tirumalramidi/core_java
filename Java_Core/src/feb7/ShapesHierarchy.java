package feb7;

class Shape {
    // Method to calculate area (empty in the base class)
    public double calculateArea() {
        return 0;
    }

    // Method to calculate perimeter (empty in the base class)
    public double calculatePerimeter() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding method to calculate area for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Overriding method to calculate perimeter for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding method to calculate area for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Overriding method to calculate perimeter for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class ShapesHierarchy {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calculate and print area and perimeter of Circle
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Calculate and print area and perimeter of Rectangle
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
