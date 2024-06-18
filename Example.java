public class Example {
    // Function with arguments and return type
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Example example = new Example();
        int result = example.add(5, 3);
        System.out.println("Sum: " + result); // Output: Sum: 8
    }
}
