package lesson2.demos.demo7_innerclasses;

public class Main {
    public static void main(String[] args) {
        Wrap wrap = new Wrap(0);

        Wrap.addOperations addOperations = wrap.new addOperations();
        addOperations.addOne();
        addOperations.addTwo();
        System.out.println(wrap.getX());

        Wrap.removeOperations removeOperations = wrap.new removeOperations();
        removeOperations.removeTwo();
        System.out.println(wrap.getX());

    }
}
