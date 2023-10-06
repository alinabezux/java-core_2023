package lesson2.demos.demo6_static.singletone;

public class Main {
    public static void main(String[] args) {
        User vasya = User.getInstance("vasya");
        User petya = User.getInstance("petya");
        System.out.println(petya);

    }
}
