package lesson2.hw.task3;


import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Book extends Papirus {
    private int pages;

    public Book(String format, int pages) {
        super(format);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                "} " + super.toString();
    }
}
