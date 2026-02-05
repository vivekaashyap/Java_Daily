
public class _14Sort {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 6, 1};
        bubble(arr);
        selection(arr);
        // insertion(arr);
    }

    // public static void insertion(int arr[]) {
    //     // int arr[] = {2, 3, 4, 6, 1};
    //     for (int i = 1; i < arr.length; i++) {
    //         int key = arr[i];
    //         int j = i - 1;
    //         while () {
    //         }
    //     }
    // }
    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[pos] > arr[j]) {
                    pos = j;
                }
            }
            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean sorted = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    sorted = true;
                }
            }
            if (!sorted) {
                break;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
