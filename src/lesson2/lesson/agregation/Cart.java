package lesson2.lesson.agregation;

import lesson2.lesson.composition.Phone;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Cart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
