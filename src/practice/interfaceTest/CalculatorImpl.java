package practice.interfaceTest;

public class CalculatorImpl implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

}

class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.sub(1, 2));
        System.out.println(calculator.mul(1, 2));
        System.out.println(calculator.div(1, 2));
    }
}
