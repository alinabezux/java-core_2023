package lesson2.demos.demo8_staticInnerClasses;

public class Main {
    public static void main(String[] args) {

        System.out.println(Wrap.x);
        Wrap.addOperations addOperations = new Wrap.addOperations();
        addOperations.addOne();
        addOperations.addOne();
        addOperations.addOne();
        System.out.println(Wrap.x);
        Wrap.removeOperations removeOperations = new Wrap.removeOperations();
        removeOperations.removeTwo();
        System.out.println(Wrap.x);
    }
}
