
public class _13ParitySort {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 45, 56, 67, 7};
        int even = 0, odd = arr.length - 1;
        while (even < odd) {
            if (arr[even] % 2 == 0) {
                even++;
            } else if (arr[odd] % 2 != 0) {
                odd--;
            } else {
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
