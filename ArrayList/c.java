
import java.util.*;

public class c {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {11, 15, 6, 8, 9, 10};
        int target = 16;
        for (int i : arr) {
            list.add(i);
        }
        boolean present = false;
        int pivot = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int r = pivot, n = list.size(), l = (pivot + 1) % n;
        while (l != r) {
            int t = list.get(l) + list.get(r);
            if (t == target) {
                present = true;
                break;
            } else if (t < target) {
                l = (l + 1) % n;
            } else {
                r = (n + r - 1) % n;
            }
        }
        System.out.println(present);
    }
}
