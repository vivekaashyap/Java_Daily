
public class _08 {

    public static void main(String[] args) {
        int n = 5;
        int t = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (i * 2); j++) {
                System.out.print(t);
            }
            t++;
            System.out.println();
        }
    }
}
