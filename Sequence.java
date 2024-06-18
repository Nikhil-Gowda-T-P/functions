class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    void displayResult(int result) {
        System.out.println("Result: " + result);
    }
}

public class Sequence {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(5, 3);
        int product = calc.multiply(sum, 2);
        calc.displayResult(product);
    }
}