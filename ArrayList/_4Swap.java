
import java.util.ArrayList;

public class _4Swap {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int i = 1, j = 2;
        System.out.println(list);
        swap(list, i, j);
        System.out.print(list);
    }

    //[2,5,9,3,6]
    public static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
