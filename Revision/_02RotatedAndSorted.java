
public class _02RotatedAndSorted {

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        int target = 9;
        System.out.print(binary(arr, target));
    }

    public static int binary(int[] arr, int target) {
        int st = 0, ed = arr.length - 1;
        while (st <= ed) {
            int mid = st + (ed - st) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[st] <= arr[mid]) {
                if (arr[mid] > target && arr[st] <= target) {
                    ed = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (arr[mid] < target && arr[ed] >= target) {
                    st = mid + 1;
                } else {
                    ed = mid - 1;
                }
            }
        }
        return -1;
    }
}
