package lesson3.lesson.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 2);
        Circle circle = new Circle(5);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);

        Square square = new Square(5);
        shapes.add(square);

        for (Shape shape : shapes) {
            shape.printPerimeter();
        }
        System.out.println(Shape.a);

    }
}
