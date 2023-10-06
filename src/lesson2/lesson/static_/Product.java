package lesson2.lesson.static_;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Product {
    public static int count = 0;
    private String name;
    private double price;
    private ArrayList<Review> reviews = new ArrayList<>();


    public Product() {
        count++;
    }

    public void showInfo() {
        System.out.println("Name: " + name + " price: " + price + "$");
    }

    public void addReview(String text, int rating) {
        Review review = new Review();
        review.setText(text);
        review.setRating(rating);
        reviews.add(review);
    }

}
