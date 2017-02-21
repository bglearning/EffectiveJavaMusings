package ejm.chapter04.item20;

public class Rectangle extends Figure {

    protected double length;
    protected double breadth; 

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}
