package feb7;


class new_Shape {
    // Method to calculate area (empty in the base class)
    public double calculateArea() {
        return 0;
    }

    // Method to calculate perimeter (empty in the base class)
    public double calculatePerimeter() {
        return 0;
    }
}

class new_Circle extends new_Shape {
    private double radius;

    // Constructor for Circle
    public new_Circle(double radius) {
        this.radius = radius;
    }

    // Overriding method to calculate area for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Overriding toString method for Circle
    @Override
    public String toString() {
        return "Circle with radius " + radius + " has an area of " + calculateArea();
    }
}

class new_Rectangle extends new_Shape {
    private double length;
    private double width;

    // Constructor for Rectangle
    public new_Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding method to calculate area for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Overriding toString method for Rectangle
    @Override
    public String toString() {
        return "Rectangle with length " + length + " and width " + width + " has an area of " + calculateArea();
    }
}

public class MethodOverridingtoString {
    public static void main(String[] args) {
        new_Circle circle = new new_Circle(5);
        new_Rectangle rectangle = new new_Rectangle(4, 6);

        // Print custom string representation for Circle
        System.out.println(circle);

        // Print custom string representation for Rectangle
        System.out.println(rectangle);
    }
}
