package lesson2.demos.demo1_composition_agregation;

public class Main {

    Passport passport = new Passport("qwerty", "asdfg");
    User ser = new User(1, "asdf", passport);

    User user2 = new User(1, "sdf", "fghjkl", "cvbnm");
    Passport passport2 = user2.getPassport();
    Custumer custumer = new Custumer("asd", "xdhegwbveh", passport2);

}
