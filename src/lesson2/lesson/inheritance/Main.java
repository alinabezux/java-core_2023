package lesson2.lesson.inheritance;

public class Main {
    //наслідування (клас розширяє обєкт)
    public static void main(String[] args) {
        Notebook product = new Notebook();
        product.setName("notebook");
        product.setPrice(5);
        product.showInfo();

        product.setNumberOfSheets(24);
        System.out.println(product.getNumberOfSheets());
    }

    //композиція (клас контролює обєкт)
    //агрегація (клас отримує обєкт)
}
