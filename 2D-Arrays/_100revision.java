
public class _100revision {

    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 4}};
        int key = 4;
        boolean t = search(arr, key);
        System.out.println(t);
    }

    public static boolean search(int arr[][], int key) {
        int row = 0, col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                return true;
            } else if (arr[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
