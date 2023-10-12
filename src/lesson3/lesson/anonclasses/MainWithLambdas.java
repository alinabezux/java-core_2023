package lesson3.lesson.anonclasses;

public class MainWithLambdas {
    public static void main(String[] args) {
        CalculatorOperation addOperation = (a, b) -> a + b;

        CalculatorOperation minusOperation = (a, b) -> a - b;

        int i = addOperation.doSomething(2, 2);
        System.out.println(i);
        int i1 = minusOperation.doSomething(4, 6);
        System.out.println(i1);


    }
}
