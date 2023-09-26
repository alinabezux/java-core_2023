package lesson1.demo2;

public class Main {
    public static void main(String[] args) {
        System.out.println("start prog");

        User user = new User();
        user.id = 1;
        user.name = "vasya";
        user.status = true;
        user.weight = 40.1;
        System.out.println(user);

        System.out.println("end prog");
    }
}
