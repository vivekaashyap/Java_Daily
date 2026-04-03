
public class _04String {

    public static void main(String[] args) {
        int arr[] = {11, 9, 10};
        int sum = 0;
        for (int n : arr) {
            if (n <= 9) {
                sum += n;
            } else {
                while (n != 0) {
                    sum += n % 10;
                    n /= 10;
                }
            }
        }
        System.out.println(sum);
        // 
        // 
    }
}
