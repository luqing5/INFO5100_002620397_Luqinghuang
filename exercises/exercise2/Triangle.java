package exercises.exercise2;

class Triangle extends Shape{

    private double base;
    private double height;
    public Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }
    @Override
    public double calculateArea() {
         return 0.5*base*height;
    }
    @Override
    public double calculatePerimeter() {
         double side=Math.sqrt(base* base+height*height);
         return base+height+side;
    }
    
}