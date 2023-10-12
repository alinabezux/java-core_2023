package lesson3.lesson.anonclasses;

public class Main {
    public static void main(String[] args) {
        CalculatorOperation addOperation = new CalculatorOperation() {
            @Override
            public int doSomething(int a, int b) {
                return a + b;
            }
        };

        CalculatorOperation minusOperation = new CalculatorOperation() {
            @Override
            public int doSomething(int a, int b) {
                return a - b;
            }
        };

        int i = addOperation.doSomething(2, 2);
        System.out.println(i);
        int i1 = minusOperation.doSomething(4, 6);
        System.out.println(i1);


        AddOperation addOperation1 = new AddOperation();
        int i2 = addOperation1.doSomething(5, 5);
        System.out.println(i2);
    }
}
