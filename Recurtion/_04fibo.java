
public class _04fibo {

    public static void main(String[] args) {
        int n = 5;
        System.out.print(fibo(n));
    }

    public static int fibo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fibo(n - 1);
    }
}
