
import java.util.ArrayList;

public class _1Start {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        int t = list.get(2);
        System.out.println(t);
        list.set(3, 40);
        System.out.println(list);
        System.out.println(list.contains(5 - 1));
        System.out.println(list.contains(50));
        System.out.println(list.size());
    }
}
