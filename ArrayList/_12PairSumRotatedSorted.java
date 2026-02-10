
import java.util.ArrayList;

public class _12PairSumRotatedSorted {

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
        int ed = pivot, n = list.size(), st = (pivot + 1) % n;
        while (st != ed) {
            if (list.get(st) + list.get(ed) == target) {
                present = true;
                break;
            } else if (list.get(st) + list.get(ed) < target) {
                st = (st + 1) % n;
            } else {
                ed = (n + ed - 1) % n;
            }
        }
        System.out.println(pivot);
        System.out.println(present);
        System.out.println(list);
    }
}
