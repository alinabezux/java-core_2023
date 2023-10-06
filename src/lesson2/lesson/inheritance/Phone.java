package lesson2.lesson.inheritance;

import lombok.Data;

@Data
public class Phone extends Product {
    private String manufacturer;

    public void showManufacturer() {
        System.out.println(manufacturer);
    }
}

