package lesson3.lesson.functional_Interfaces;

import lesson3.lesson.interfaces.Rectangle;
import lesson3.lesson.interfaces.Shape;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addOperation = Integer::sum;
        Function<String, Integer> charsCount = String::length;
        Function<Shape, Double> per = Shape::getPerimeter;
        Supplier<Shape> rectangleCreator = () -> new Rectangle(1, 5);
        Consumer<Shape> shapeConsumer = shape -> System.out.println(shape.getPerimeter());

        System.out.println(charsCount.apply("hello"));
        System.out.println(rectangleCreator.get().getPerimeter());
        System.out.println(per.apply(rectangleCreator.get()));
        shapeConsumer.accept(rectangleCreator.get());
    }
}
