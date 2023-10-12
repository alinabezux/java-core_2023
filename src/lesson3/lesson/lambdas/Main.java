package lesson3.lesson.lambdas;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(-56);
        integers.add(234);
        integers.add(29);
        integers.add(4);

        System.out.println(integers);

        Comparator<Integer> integerComparator = Comparator.comparingInt(o -> o);
        integers.sort(integerComparator);
        System.out.println(integers);

        integers.sort((o1, o2) -> o2 - o1);
        System.out.println(integers);
    }
}
