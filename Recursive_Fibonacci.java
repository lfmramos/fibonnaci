/**
 * This class provides a method to compute Fibonacci numbers recursively.
 */
public class Recursive_Fibonacci {

    /**
     * The main method that serves as the entry point of the program.
     * It prints the first 10 Fibonacci numbers.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    /**
     * Computes the nth Fibonacci number recursively.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}