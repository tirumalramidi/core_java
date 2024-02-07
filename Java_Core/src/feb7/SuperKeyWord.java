package feb7;

class newShape {
    // Method to print a message before calculating area
    public void calculateAreaMessage() {
        System.out.println("Calculating area...");
    }

    // Method to calculate area (empty in the base class)
    public double calculateArea() {
        return 0;
    }

    // Method to print a message before calculating perimeter
    public void calculatePerimeterMessage() {
        System.out.println("Calculating perimeter...");
    }

    // Method to calculate perimeter (empty in the base class)
    public double calculatePerimeter() {
        return 0;
    }
}

class myCircle extends newShape {
    private double radius;

    // Constructor for Circle
    public myCircle(double radius) {
        this.radius = radius;
    }

    // Overriding method to calculate area for Circle
    @Override
    public double calculateArea() {
        super.calculateAreaMessage(); // Call superclass method
        return Math.PI * radius * radius;
    }

    // Overriding method to calculate perimeter for Circle
    @Override
    public double calculatePerimeter() {
        super.calculatePerimeterMessage(); // Call superclass method
        return 2 * Math.PI * radius;
    }
}

class myRectangle extends newShape {
    private double length;
    private double width;

    // Constructor for Rectangle
    public myRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding method to calculate area for Rectangle
    @Override
    public double calculateArea() {
        super.calculateAreaMessage(); // Call superclass method
        return length * width;
    }

    // Overriding method to calculate perimeter for Rectangle
    @Override
    public double calculatePerimeter() {
        super.calculatePerimeterMessage(); // Call superclass method
        return 2 * (length + width);
    }
}

public class SuperKeyWord {
    public static void main(String[] args) {
        myCircle circle = new myCircle(5);
        myRectangle rectangle = new myRectangle(4, 6);

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
