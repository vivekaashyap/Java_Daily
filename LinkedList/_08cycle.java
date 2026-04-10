public class _08cycle {
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

    public void printSafe(int limit) {
        Node temp = head;
        int count = 0;
        while (temp != null && count < limit) {
            System.out.print(temp.data + "-");
            temp = temp.next;
            count++;
        }
        System.out.println("...");
    }

    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
    
        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
    
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
    
        if (!cycle) return;
    
        // Step 2: Find start of cycle
        slow = head;
        Node prev = null;
    
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
    
        // Step 3: Break the cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        _08cycle ll = new _08cycle();

        head = ll.new Node(1);
        head.next = ll.new Node(2);
        head.next.next = ll.new Node(3);

        // create cycle
        head.next.next.next = head;

        ll.printSafe(10); // safe print (limit to avoid infinite loop)

        System.out.println("Cycle present: " + ll.detectCycle());
    }
}