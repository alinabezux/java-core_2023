package lesson2.hw.task3;


import lombok.NoArgsConstructor;


@NoArgsConstructor

public class Magazine extends Book {
    private String style;

    public Magazine(String format, int pages, String style) {
        super(format, pages);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "style='" + style + '\'' +
                "} " + super.toString();
    }
}
