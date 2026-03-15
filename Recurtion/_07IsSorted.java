
public class _07IsSorted {

    public static void main(String[] args) {
        int arr[] = {11, 3, 4, 5, 6};
        int i = 0;
        System.out.print(issorted(arr, i));
    }

    public static boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }
}
