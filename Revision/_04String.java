
public class _04String {

    public static void main(String[] args) {
        String s = "12321";
        int n = 12321;
        String sb = new StringBuilder(s).reverse().toString();
        if (n == Integer.valueOf(sb)) {
            System.out.print(true);
        }
        System.out.print("\u2764" + sb);
    }
}
