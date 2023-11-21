package exercises.exercise3b;

import java.io.Serializable;

class Circle extends Shape implements Serializable {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
