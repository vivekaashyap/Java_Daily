
public class ColorSort {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int st = 0, ed = nums.length - 1, i = 0;

        while (i <= ed) {
            if (nums[i] == 0) {
                int t = nums[i];
                nums[i] = nums[st];
                nums[st] = t;
                i++;
                st++;
            } else if (nums[i] == 2) {
                int t = nums[i];
                nums[i] = nums[ed];
                nums[ed] = t;
                ed--;
            } else {
                i++;
            }
        }

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
