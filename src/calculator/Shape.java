package calculator;

public abstract class Shape {

    public abstract double getArea(); // lub public double getArea() { return -1 } bo nigdy nie zwróci tej wartości dla naszych figur.
    //Mogłoby zwrócić dla wielokątu, ale nie bierzemy go pod uwagę w Calculatorze

    public abstract double getPerimeter();
}
