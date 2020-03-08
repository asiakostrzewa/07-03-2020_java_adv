package calculator;

public class Triangle extends Polygons {

    private double a;
    private double h;
    private double b;
    private double c;

    public Triangle(double a, double h, double b, double c) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return (a * h) / 2;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public int getNumberOfEdges() {
        return 3;
    }

}
