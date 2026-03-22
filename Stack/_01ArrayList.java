
import java.util.*;

public class _01ArrayList {

    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        //push
        public static void push(int data) {
            list.add(data);
        }

        //pop
        public static int pop() {
            int t = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return t;
        }

        //peek
        public static int peek() {
            return list.get(list.size() - 1);
        }

        //isEmpty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
