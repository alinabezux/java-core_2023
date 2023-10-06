package lesson2.lesson.enums;

import lombok.Data;

@Data
public class Phone extends Product {
    private String manufacturer;

    public void showManufacturer() {
        System.out.println(manufacturer);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                "} " + super.toString();
    }
}

