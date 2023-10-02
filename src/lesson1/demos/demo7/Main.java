package lesson1.demos.demo7;

public class Main {
    public static void main(String[] args) {

//        String[] skills = new String[50];
//        skills[0] = "qr";
//        skills[1] = "asf";
//        User user = new User(1, "Vasya", skills);
        User user = new User(1, "kokos");
        user.addSkill(0, "java");
        user.addSkill(1, "javaScript");
        System.out.println(user);

    }
}
