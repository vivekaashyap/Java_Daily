
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
        boolean t = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) <= list.get(i + 1)) {
                t = false;
            } else if (list.get(i) >= list.get(i + 1)) {
                t = false;
            }
        }
        return t;
    }
}
