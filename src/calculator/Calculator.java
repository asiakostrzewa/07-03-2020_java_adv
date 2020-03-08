package calculator;

import java.util.Random;

public class Calculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[20];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = getRandomShape();
        }
        for (Shape shape : shapes) {
            /*if (shape == null) { //do exeptionów
                return;
            } else*/
            System.out.println(shape.getArea());
            //System.out.println(shape.getClass().getName());
        }
    }

    private static Shape getRandomShape() {
        Random random = new Random();
        Shape result = null;
        switch (random.nextInt(4)) { //dla exeptionów zmienami na 5
            case 0:
                result = new Triangle(random.nextDouble(), random.nextDouble(), random.nextDouble(), random.nextDouble());
                return result;
            case 1:
                result = new Rectangle(random.nextDouble(), random.nextDouble());
                return result;
            case 2:
                result = new Square(random.nextDouble());
                return result;
            case 3:
                result = new Circle(random.nextDouble());
                return result;
            /*case 4: //do exeptionów
                try {
                    result = new Circle(-2);
                } catch (IllegalArgumentException e) {
                    System.out.println("Sytuacja wyjątkowa! " + e.getMessage());
                }*/
        }
        return null;
    }
}
