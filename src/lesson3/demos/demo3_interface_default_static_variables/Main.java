package lesson3.demos.demo3_interface_default_static_variables;

public class Main {
    public static void main(String[] args) {
        System.out.println(Some.x);

        Foo foo = new Foo();
        foo.asd();
//        Foo.qwe();//бо qwe static а не default

        Some.qwe();
    }
}
