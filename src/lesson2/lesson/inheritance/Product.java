package lesson2.lesson.inheritance;

import lombok.Data;

@Data
public class Product {
    private String name;
    private double price;

    public void showInfo() {
        System.out.println("Name: " + name + " price: " + price + "$");
    }

}
