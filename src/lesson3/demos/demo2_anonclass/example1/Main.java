package lesson3.demos.demo2_anonclass.example1;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(65);
        integers.add(45);
        integers.add(-79);
        integers.add(0);
        System.out.println(integers);

//        ComparatorImpl comparator = new ComparatorImpl();
//        integers.sort(comparator);

        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(integers);


        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(integers);
    }
}
