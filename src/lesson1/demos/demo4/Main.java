package lesson1.demos.demo4;

public class Main {
    public static void main(String[] args) {
        User user2 = new User(2, "kokos", false, 55.4);
        System.out.println(user2.getName());


        user2.setName("qwerty");
        System.out.println(user2);
    }
}
