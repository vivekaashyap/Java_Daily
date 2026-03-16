
public class _09LastOccurance {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 1};
        int key = 1;
        int i = arr.length - 1;
        System.out.print(last(arr, key, i));
    }

    public static int last(int arr[], int key, int i) {
        if (i == 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return last(arr, key, i - 1);
    }
}
