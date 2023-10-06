package lesson2.hw.task3;


import lombok.NoArgsConstructor;


@NoArgsConstructor

public class Comix extends Book {
    private String genre;

    public Comix(String format, int pages, String genre) {
        super(format, pages);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Comix{" +
                "genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
