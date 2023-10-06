package lesson2.hw.task2;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC("Windows", 16, 128);
        System.out.println(pc);
        Laptop laptop = new Laptop("Linux", 8, 256, "black", 15.6);
        System.out.println(laptop);
        Ultrabook macbook = new Ultrabook("IOS", 8, 256, "silver", 13.0, true);
        System.out.println(macbook);
        Workstation workstation = new Workstation("Windows", 32, 1, "black", 15.6, true);
        System.out.println(workstation);

    }
}
