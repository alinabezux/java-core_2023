package lesson3.demos.demo1_interface;

public class Student extends Father implements Singer {
    @Override
    public void sing() {
        System.out.println("lalala");
    }
}
