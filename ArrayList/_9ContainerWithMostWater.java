
import java.util.*;

public class _9ContainerWithMostWater {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        int left = 0, right = list.size() - 1, max = 0;
        while (left < right) {
            int mh = Math.min(list.get(left), list.get(right));
            int width = right - left;
            int area = mh * width;
            max = Math.max(area, max);
            if (list.get(left) < list.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(max);
    }
}
