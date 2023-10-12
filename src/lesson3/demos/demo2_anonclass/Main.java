package lesson3.demos.demo2_anonclass;

//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Singer> singers = new ArrayList<>();
//        singers.add(new Student());
//        singers.add(new User());
//
//        Singer singer = singers.get(1);
//        singer.sing();

        Singer singer1 = new Singer() {
            @Override
            public void sing() {
                System.out.println("bebebe");
            }
        };

        Singer singer2 = new Singer() {
            @Override
            public void sing() {
                System.out.println("bobobo");
            }
        };

        singer2.sing();
        singer1.sing();


    }
}
