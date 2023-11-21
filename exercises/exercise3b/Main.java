package exercises.exercise3b;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        // Serialization
        Triangle triangle = new Triangle(5, 4);
        Rectangle rectangle = new Rectangle(6, 3);
        Circle circle = new Circle(2);
        Square square = new Square(4);

        // Save objects to a file
        saveToFile("shapes.ser", triangle, rectangle, circle, square);

        // Deserialization
        Triangle deserializedTriangle;
        Rectangle deserializedRectangle;
        Circle deserializedCircle;
        Square deserializedSquare;

        // Read objects back from the file
        Object[] shapes = readFromFile("shapes.ser");
        deserializedTriangle = (Triangle) shapes[0];
        deserializedRectangle = (Rectangle) shapes[1];
        deserializedCircle = (Circle) shapes[2];
        deserializedSquare = (Square) shapes[3];

        // Display deserialized object properties
        System.out.println("Deserialized Triangle Area: " + deserializedTriangle.calculateArea());
        System.out.println("Deserialized Triangle Perimeter: " + deserializedTriangle.calculatePerimeter());

        System.out.println("Deserialized Rectangle Area: " + deserializedRectangle.calculateArea());
        System.out.println("Deserialized Rectangle Perimeter: " + deserializedRectangle.calculatePerimeter());

        System.out.println("Deserialized Circle Area: " + deserializedCircle.calculateArea());
        System.out.println("Deserialized Circle Perimeter: " + deserializedCircle.calculatePerimeter());

        System.out.println("Deserialized Square Area: " + deserializedSquare.calculateArea());
        System.out.println("Deserialized Square Perimeter: " + deserializedSquare.calculatePerimeter());
    }

    private static void saveToFile(String fileName, Object... objects) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            for (Object obj : objects) {
                objectOut.writeObject(obj);
            }
            System.out.println("Objects have been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Object[] readFromFile(String fileName) {
        Object[] objects = new Object[4];

        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            for (int i = 0; i < objects.length; i++) {
                objects[i] = objectIn.readObject();
            }
            System.out.println("Objects have been deserialized");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return objects;
    }
}