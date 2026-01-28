
import java.util.Arrays;

public class _100Practise {

    public static void main(String[] args) {
        int[] num = {1, 4, 5, 6, 5, 8};
        int[] freq = new int[10];
        for (int i = 0; i < num.length; i++) {
            freq[num[i]]++;
        }
        System.out.println(Arrays.toString(freq));
        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] != 0) {
                num[j] = i;
                freq[i]--;
                j++;
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(freq));
    }
}
