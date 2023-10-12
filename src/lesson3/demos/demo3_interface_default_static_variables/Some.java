package lesson3.demos.demo3_interface_default_static_variables;

public interface Some {
    /*public static final*/ int x = 0;

    // in  interface  всі методи за замовчуванням public
    /*public*/ int doSome1(int x);

    int doSome2(int x);

    String doSome3();


    //default означає ,що метод asd() існує в будь-якого екземпляра,який реалізує цей інтерфейс
    default void asd() {
        System.out.println("sdfthy");
    }

    static void qwe() {
        System.out.println("qwe");
    }

}
