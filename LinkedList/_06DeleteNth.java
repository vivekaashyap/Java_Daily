public class _06DeleteNth {
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

    public void addAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail =  newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public void delete(int inx) {
        if (head == null) {
            return;
        }
        if (inx == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        Node curr = head;
        int i = 0;
        while (i < inx - 1) {
            curr = curr.next;
            i++;
        }
        // curr.next = curr.next.next;
        if (curr.next != null) {
            if (curr.next == tail) {
                tail = curr;
            }
            curr.next = curr.next.next;
        }
    }
    
    
    public static void main(String[] args) {
        _06DeleteNth ll = new _06DeleteNth();
        ll.addAtFirst(13);
        ll.addAtLast(435);
        ll.addAtLast(443);
        ll.addAtLast(4);
        ll.addAtLast(42);
        ll.print();
        ll.delete(4);
        ll.print();
    }
}