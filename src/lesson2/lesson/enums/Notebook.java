package lesson2.lesson.enums;

import lombok.Data;

@Data
public class Notebook extends Product {
    private int numberOfSheets;
    private Markup markup;

    @Override
    public String toString() {
        return "Notebook{" +
                "numberOfSheets=" + numberOfSheets +
                ", markup=" + markup.getName() +
                "} " + super.toString();
    }
}
