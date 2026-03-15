
public class _04factorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.print(factorial(n));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
