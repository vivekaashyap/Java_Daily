
import java.util.Arrays;

public class _11PrefixSum {

    public static void main(String[] main) {
        int[] arr = {2, 5, 6, 3, 1};
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pre[i] = arr[i] + pre[i - 1];
        }
        int maxSubArr = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum;
                if (i == 0) {
                    sum = pre[j];
                } else {
                    sum = pre[j] - pre[i - 1];
                }
                maxSubArr = Math.max(maxSubArr, sum);
            }
        }
        System.out.println(Arrays.toString(pre));
        System.out.println(maxSubArr);
    }
}
