package lesson3.demos.demo4_functional.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(11);
        integers.add(0);
        integers.add(-49);
        integers.add(78);
        integers.add(3);
        integers.sort(Comparator.comparingInt(o -> o));
        System.out.println(integers);


    }
}
