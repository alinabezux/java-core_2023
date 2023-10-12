package lesson3.demos.demo4_functional;

public class Main {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator() {
//            @Override
//            public int calculate(int a, int b) {
//                return 0;
//            }
//        };

        Calculator calculator = (a, b) -> {
            System.out.println();
            return a + b;
        };
//        foobar(10,20, calculator);

        Calculator calculator1 = ((a, b) -> a / b);

        foobar(10, 20, ((a, b) -> a * b));

    }

    public static void foobar(int a, int b, Calculator calculator) {
        calculator.calculate(a, b);
    }
}
