public class Example2 {
    // Function without arguments and with return type
    public String greet() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        Example2 example = new Example2();
        String message = example.greet();
        System.out.println(message); // Output: Hello, World!
    }
}
