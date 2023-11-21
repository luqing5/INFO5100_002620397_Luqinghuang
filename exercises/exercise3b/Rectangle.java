package exercises.exercise3b;

import java.io.Serializable;

//import java.io.Serializable;

public class Rectangle extends Shape implements Serializable {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateArea() {
       return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+width);
    }
    
}
