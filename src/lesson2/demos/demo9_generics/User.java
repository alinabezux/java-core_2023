package lesson2.demos.demo9_generics;

public class User<T> {
    T id;
    String name;

        public User(T id, String name) {
        this.id = id;
        this.name = name;
    }
}
