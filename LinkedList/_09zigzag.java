import java.util.LinkedList;

public class _09zigzag {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } 
        
        if (head.next == null) {
            int val = head.data;
            head = tail = null;
            return val;
        }
    
        Node prev = head;
    
        while (prev.next != tail) {
            prev = prev.next;
        }
    
        int val = tail.data;
        prev.next = null;
        tail = prev;
    
        return val;
    }
    public void zigzag() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println(ll);
    }
}
