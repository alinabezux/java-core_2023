package lesson2.demos.demo6_static;

public class User {
    public static int counter = 0;

    public User() {
        counter = counter + 1;
    }

}
