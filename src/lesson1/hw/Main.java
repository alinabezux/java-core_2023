package lesson1.hw;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Kobzar", 369, new String[]{"Shevchenko"}, "poetry"),
                new Book("Abetka", 45, new String[]{"Karpenko", "Illya"}, "education"),
                new Book("Biology", 12, new String[]{"Lysenko", "Kokos", "Baydak"}, "science"),
                new Book("Secret", 5, new String[]{"AnOnIm"}, "secret"),
                new Book("GoodBook", 78, new String[]{"Hiii", "Bye"}, "Humor"),
        };
        for (Book book : books) {
            System.out.println(book);
        }

        Car[] cars = new Car[]{
                new Car("Tesla", 200, 1.5, true),
                new Car("Lexus", 65, 2.0, false),
                new Car("Mazda", 15, 0.4, false),
                new Car("Porshe", 300, 5.0, true),
                new Car("Lamborgini", 500, 5.5, true),
        };
        for (Car car : cars) {
            System.out.println(car);
        }

        ArrayList<Dog> dogs = new ArrayList();
        dogs.add(new Dog("Marsik", 1, "chihyahya"));
        dogs.add(new Dog("Anton", 2, "buldog"));
        dogs.add(new Dog("Pes", 15, "dvornyaga"));
        dogs.add(new Dog("Kokos", 5, "vivcharka"));
        dogs.add(new Dog("Taras", 10, "akita-inu"));

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        Comment[] comments = new Comment[]{
                new Comment(1, 1, "Mykola", "mikola@gamil.com", "qwertyuiop"),
                new Comment(2, 2, "Lesya", "kola@gamil.com", "svegv"),
                new Comment(3, 3, "Max", "miko@gamil.com", "vwvqwertyuiop"),
                new Comment(4, 4, "Lilia", "ko@gamil.com", "qwertyvweawuiop"),
                new Comment(5, 5, "Anonim", "a@gamil.com", "qwertfwefyuiop"),

        };
        for (Comment comment : comments) {
            System.out.println(comment);
        }

        ArrayList<Post> posts = new ArrayList();
        posts.add(new Post(2, 5, "ervc", "szxdrtfvgbhnjmk,jnbgvcdx"));
        posts.add(new Post(5, 45, "gcfvjb", "zxcvbnm,loi"));
        posts.add(new Post(24, 6, "fcvg", "xcvbnm,.kjhgf"));
        posts.add(new Post(4, 65, "tyguh", "qwertyuioplkjhgfds"));

        for (Post post : posts) {
            System.out.println(post);
        }

    }

}
