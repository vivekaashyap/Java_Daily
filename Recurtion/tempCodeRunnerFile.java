
public class _11PowOptimized {

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        int t = optimize(x, n);
        System.out.print(t);
    }

    public static int optimize(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPow =