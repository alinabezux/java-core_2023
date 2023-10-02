package lesson1.demos.demo8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        User[] users = new User[3];
//        users[0] = new User(1, "qwert");
//        users[1] = new User(2, "cvbn");
//        System.out.println(users);
//        System.out.println(Arrays.toString(users));

//        ArrayList<User> users = new ArrayList();
//        users.add(new User(1, "Igor"));
//        users.add(new User(2, "Olya"));
//
//        System.out.println(users);
//        System.out.println(users.get(0));
//        System.out.println(users.size());

        User vasya = new User(1, "Vasya");
        ArrayList<String> skills = vasya.getSkills();
        skills.add("java");
        skills.add("java1");
        skills.add("java2");
        skills.add("java3");

        System.out.println(vasya);
    }
}
