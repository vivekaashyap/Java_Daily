
public class _12 {

    public static void main(String[] args) {
        int n = 5;
        int t = 1;
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= 2 * i; j++) {
                System.out.print(t + " ");
            }
            t++;
            System.out.println();
        }
    }
}
