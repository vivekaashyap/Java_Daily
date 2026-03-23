
public class _03 {

    public static void main(String[] args) {
        int t = 1, n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(t++ + " ");
            }
            System.out.println();
        }
    }
}
