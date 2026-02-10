
import java.util.*;

public class _11PairSum2Pointer {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int l = 0, r = list.size() - 1, target = 5;
        boolean present = false;
        while (l < r) {
            int t = list.get(l) + list.get(r);
            if (target == t) {
                present = true;
                break;
            } else if (target > t) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println(present);
    }
}
