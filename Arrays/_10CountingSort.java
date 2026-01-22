
import java.util.*;

public class _10CountingSort {

    public static void main(String[] args) {
        int[] num = {1, 3, 5, 4, 3, 2, 1, 9, 8, 6, 5, 4, 3, 2, 4, 5, 7, 7, 3, 4, 4};
        int max = Integer.MIN_VALUE;
        // Here we find maximum number.
        for (int i = 0; i < num.length; i++) {
            max = Math.max(max, num[i]);
        }
        // Here we find frequency of each number.
        int count[] = new int[max + 1];
        for (int i = 0; i < num.length; i++) {
            count[num[i]]++;
        }
        //update the original array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.print(Arrays.toString(num));
    }
}
