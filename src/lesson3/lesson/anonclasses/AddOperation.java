package lesson3.lesson.anonclasses;

public class AddOperation implements CalculatorOperation {
    @Override
    public int doSomething(int a, int b) {
        return a + b;
    }
}
