package lesson3.lesson.interfaces;

public interface Shape {

    // public static final
    double a = 10;

    // public
    double getPerimeter();

    // public
    static int getCount() {
        return 100;
    }

    default void printPerimeter() {
        System.out.println(getPerimeter());
    }
}
