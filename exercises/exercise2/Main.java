package exercises.exercise2;

public class Main {
    public static void main(String[] args) {
        // Create instances of various shapes
        Triangle triangle = new Triangle(5, 4);
        Rectangle rectangle = new Rectangle(6, 3);
        Circle circle = new Circle(2);
        Square square = new Square(4);

        // Store the shapes in an array for polymorphism
        Shape[] shapes = {triangle, rectangle, circle, square};

        // Calculate and display the properties of each shape
        for (Shape shape : shapes) {
            System.out.println("Shape Type: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();

            // You can add more properties and methods for each shape as needed
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println("Circle Radius: " + c.getRadius());
            }
        }
    }
}

