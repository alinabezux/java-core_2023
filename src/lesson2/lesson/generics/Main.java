package lesson2.lesson.generics;

public class Main {
    public static void main(String[] args) {
        User<String> user1 = new User<>();
        user1.setId("qwert");
        user1.setName("user1");

        User<Integer> user2 = new User<>();
        user2.setId(1);
        user2.setName("asdfgh");

        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
    }
}
