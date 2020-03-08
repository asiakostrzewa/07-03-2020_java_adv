package calculator;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
        }

    @Override
    public double getArea() {
        if (r <= 0) {
            throw new IllegalArgumentException("Promień nie może być mniejszy bądź równy 0");
        } else
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        if (r <= 0) {
            throw new IllegalArgumentException("Promień nie może być mniejszy bądź równy 0");
        } else
        return  2 * Math.PI * r;
    }

}
