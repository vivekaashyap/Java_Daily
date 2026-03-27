
public class _01BinarySearch {

    public static int binary(int[] arr, int target) {
        int st = 0, ed = arr.length - 1;
        while (st <= ed) {
            int mid = st + (ed - st) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] >= target) {
                ed = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 8};
        int target = 8;
        System.out.print(binary(arr, target));
    }
}
