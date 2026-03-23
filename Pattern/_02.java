
public class _02 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int t = 1;
            for (int j = n - i; j > 0; j--) {
                System.out.print(t++);
            }
            System.out.println();
        }
    }
}
