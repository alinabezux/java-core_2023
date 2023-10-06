package lesson2.demos.demo8_staticInnerClasses.builder;

public class Main {
    public static void main(String[] args) {
//        User kokos = User.getBuilder().setId(10).setName("kokos").build();
//        System.out.println(kokos);

        User kokosik = User.builder().id(10).name("kokosik").build();
        System.out.println(kokosik);
    }
}
