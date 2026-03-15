
public class _05Fibonacci {

    public static void main(String[] args) {
        int n = 5;
        System.out.print(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
