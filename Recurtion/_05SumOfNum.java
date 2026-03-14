
public class _05SumOfNum {

    public static void main(String[] args) {
        int n = 5;
        System.out.print(sum(n));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
