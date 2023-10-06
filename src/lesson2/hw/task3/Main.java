package lesson2.hw.task3;

public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine("A4", 56, "glossy");
        Comix comix = new Comix("A3", 12, "superheroes");

        System.out.println(magazine);
        System.out.println(comix);
    }
}
