
import java.util.*;

public class _10PairSum {

    public static void main(String[] args) {
        //Brute force
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int sum = 0, target = 5;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                sum += list.get(i) + list.get(j);
                if (target == list.get(i) + list.get(j)) {
                    System.out.println("Target would be " + i + " " + j + ".");
                }
            }
        }
        System.out.println(sum);
    }
}
