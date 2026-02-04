
public class _100revision {

    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 4}};
        int key = 4;
        boolean t = search(arr, key);
        System.out.println(t);
    }

    public static boolean search(int arr[][], int key) {
        int strow = 0, edrow = arr.length - 1;
        while (strow < arr.length && edrow >= 0) {
            if (arr[strow][edrow] == key) {
                return true;
            } else if (arr[strow][edrow] > key) {
                edrow--;
            } else {
                strow++;
            }
        }
        return false;
    }
}
