package calculator;

public class Rectangle extends Polygons {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return (2 * a) + (2 * b);
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public int getNumberOfEdges() {
        return 4;
    }

}
