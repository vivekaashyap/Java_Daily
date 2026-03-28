
public class _03Pow {

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.print(pow(x, n));
    }

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int half = pow(x, n / 2);
        int pow = half * half;
        if (n % 2 != 0) {
            pow = x * pow;
        }
        return pow;
    }
}
