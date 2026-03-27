
import java.util.*;

public class _02ques {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // enqueue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Queue after enqueue: " + q);

        // peek
        System.out.println("Front element: " + q.peek());

        // dequeue
        System.out.println("Removed element: " + q.poll());
        System.out.println("Queue after dequeue: " + q);

        // size
        System.out.println("Size: " + q.size());

        // isEmpty
        System.out.println("Is empty: " + q.isEmpty());

        // contains
        System.out.println("Contains 20? " + q.contains(20));

        // traversal
        System.out.print("Traverse queue: ");
        for (int i : q) {
            System.out.print(i + " ");
        }
        System.out.println();

        // clear
        q.clear();
        System.out.println("Queue after clear: " + q);

        // check again
        System.out.println("Is empty after clear: " + q.isEmpty());
    }
}
