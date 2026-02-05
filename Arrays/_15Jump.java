
public class _15Jump {

    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 0, 4};
        int max = 0, n = arr.length;
        boolean yes = true;
        for (int i = 0; i < n; i++) {
            if (i > max) {
                yes = false;
            }
            max = Math.max(max, i + arr[i]);
        }
        System.out.println(yes);
    }
}
