
public class _10Pow {

    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.print(pow(x, n));
    }

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);
    }
}
