package lesson2.lesson.agregation;

public class Main {
    //агрегація (клас отримує обєкт)
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setName("phone");
        phone.setPrice(456);
        phone.setManufacturer("xiaomi");

        phone.addReview("blablabla", 4);
        phone.addReview("foofooofoo", 0);

        Notebook notebook = new Notebook();
        notebook.setName("clitunka");
        notebook.setPrice(12);
        notebook.setNumberOfSheets(10);


        Cart cart = new Cart();
        cart.addProduct(phone);
        cart.addProduct(notebook);
        System.out.println("Total: " + cart.getTotalPrice());

    }
}
