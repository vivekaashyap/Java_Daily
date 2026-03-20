
public class _12Tiling {

    public static void main(String args[]) {
        int n = 5;
        System.out.println(tile(n));
    }

    public static int tile(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return tile(n - 1) + tile(n - 2);
    }
}
