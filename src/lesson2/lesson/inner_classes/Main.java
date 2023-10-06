package lesson2.lesson.inner_classes;

public class Main {
    public static void main(String[] args) {
        new Main().new InnerClass().print();

        class InnerMethodClass {
            void printText() {
                System.out.println("hello");
            }
        }
        new InnerMethodClass().printText();
    }

    class InnerClass {
        public void print() {
            System.out.println("werty");
        }
    }


}
