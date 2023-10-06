package lesson2.lesson.agregation;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Product {
    private String name;
    private double price;
    private ArrayList<Review> reviews = new ArrayList<>();

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
