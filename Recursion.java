class Factorial {
    int factorial(int n) {
        if (n == 0) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int result = fact.factorial(5);
        System.out.println("Factorial: " + result);
    }
}
