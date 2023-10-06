package lesson2.lesson.static_;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setName("iphone 12");
        phone.setPrice(560);
        phone.setManufacturer("apple");

        phone.addReview("blablabla", 5);
        phone.addReview("foo", 1);

        Notebook notebook = new Notebook();
        notebook.setName("nb");
        notebook.setNumberOfSheets(24);
        notebook.setPrice(45);

        System.out.println(Product.count);
    }
}
