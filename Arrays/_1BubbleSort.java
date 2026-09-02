
public class _1BubbleSort {

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (swap == 0) {
                break;
            }
        }
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
