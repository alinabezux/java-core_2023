package lesson2.demos.demo5_abstract;

public class Horse extends Animal {
    private int legs;
    private String power;

    @Override
    public void signalise() {
        System.out.println("igogogo");
    }
}
