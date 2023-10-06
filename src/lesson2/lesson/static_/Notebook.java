package lesson2.lesson.static_;

import lombok.Data;

@Data
public class Notebook extends Product {
    private int numberOfSheets;

    @Override
    public String toString() {
        return "Notebook{" +
                "numberOfSheets=" + numberOfSheets +
                "} " + super.toString();
    }
}
