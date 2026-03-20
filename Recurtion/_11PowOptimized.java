
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
        int halfPow = optimize(x, n / 2);
        int pow = halfPow * halfPow;
        if (n % 2 != 0) {
            pow = pow * x;
        }
        return pow;
    }
}
