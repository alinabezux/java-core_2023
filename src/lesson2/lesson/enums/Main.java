package lesson2.lesson.enums;


public class Main {
    //enum
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.setName("nb");
        notebook.setPrice(45);
        notebook.setNumberOfSheets(45);
        notebook.setMarkup(Markup.CELL);

        System.out.println(notebook);

    }
}
