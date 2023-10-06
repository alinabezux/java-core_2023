package lesson2.demos.demo9_generics;

public class Main {
    public static void main(String[] args) {
//        User kokos = new User(1, "kokos");
//        User nekokos = new User("11qwert", "nekokos");
//
//        User[] users = {kokos, nekokos};
//
//        for (User user : users) {
//            if (user.id instanceof String) {
//                String id = (String) user.id;
//                System.out.println(id.contains("134"));
//            }
//        }

        User<String> stringUser = new User<>("qwerty", "asdfghjk");
        User<Integer> sdfghj = new User<>(1, "sdfghj");

    }
}
