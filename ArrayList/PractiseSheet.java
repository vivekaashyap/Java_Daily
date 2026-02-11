
import java.util.ArrayList;

public class PractiseSheet {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4};
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : arr) {
            list.add(x);
        }
        boolean t = Question1(list);
        System.out.println(t);
    }

    public static boolean Question1(ArrayList<Integer> list) {
        int n = list.size() - 1;//last index
        if (list.get(0) > list.get(n)) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) < list.get(i + 1)) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
