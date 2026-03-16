
public class _08FirstOccrance {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int i = 0;
        System.out.print(first(arr, i));
    }

    public static int first(int arr[], int i) {
        int key = 4;
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return first(arr, i + 1);
    }
}
