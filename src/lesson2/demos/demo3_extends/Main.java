package lesson2.demos.demo3_extends;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SuperUser superUser = new SuperUser();
        superUser.greeting();
        superUser.foo();

        User user = new SuperUser();
        SuperUser superUser1 = (SuperUser) user;
        superUser1.foo();

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(superUser);

        User userSU = users.get(1);
//        userSU.foo() //impossible
        //через те,що він був в листі з юзереми
        SuperUser SuperUser2 = (SuperUser) users.get(1);
        SuperUser2.foo();
    }
}
