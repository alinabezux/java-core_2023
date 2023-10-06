package lesson2.lesson.composition;

public class Main {
    //композиція (клас контролює обєкт) коли один клас не існує без іншого
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setName("phone");
        phone.setPrice(456);
        phone.setManufacturer("xiaomi");

//        Review review1 = new Review();
//        review1.setText("cool");
//        review1.setRating(5);
//
//        Review review2 = new Review();
//        review2.setText("foo");
//        review1.setRating(1);
//
//        Review review3 = new Review();
//        review3.setText("delicious");
//        review1.setRating(4);

        phone.addReview("blablabla", 4);

        System.out.println(phone);

        Notebook notebook = new Notebook();
        notebook.setName("druk");
        notebook.setPrice(45);
        notebook.addReview("foofooofoo", 0);
        System.out.println(notebook);
    }
    //агрегація (клас отримує обєкт)
}
