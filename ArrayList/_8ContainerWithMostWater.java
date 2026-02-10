
import java.util.ArrayList;

public class _8ContainerWithMostWater {

    public static void main(String[] args) {
        //Using arrays
        // int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        // int water = 0, height = 0, width = 0;
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         height = Math.min(arr[i], arr[j]);
        //         width = j - i;
        //         water = height * width;
        //         max = Math.max(water, max);
        //     }
        // }
        // System.out.println(max);
        // using ArrayList
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
        int water = 0, height = 0, width = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                height = Math.min(list.get(i), list.get(j));
                width = j - i;
                water = height * width;
                max = Math.max(water, max);
            }
        }
        System.out.println(max);
    }
}
