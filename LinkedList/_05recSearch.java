public class _05recSearch {
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
    public static int size;

    public void addAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = head = newNode;
            size = 1;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = head = null;
            size = 1;
            return;
        }
        tail.next = newNode;
        newNode = tail;
        size++;
    }

    public void addAtMiddle(int inx, int data) {
        if (inx == 0) {
            addAtFirst(data);
            size = 1;
            return;
        }
        Node newNode = new Node(data);
        int i = 0;
        Node temp = head;
        while (i < inx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next; 
        }System.out.println(" null");
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return 0;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public void reverse() {
        Node prev =  null;
        Node curr = head;
        Node next;
        tail = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    // public int search(int key) {
    //     return helper(head, key);
    // }
    public static void main(String[] args) {
        _05recSearch ll = new _05recSearch();
        ll.addAtFirst(1);
        ll.addAtFirst(10);
        ll.addAtFirst(100);
        ll.addAtFirst(1000);
        ll.addAtLast(23);
        ll.addAtMiddle(2, 456);
        System.out.println(ll.helper(head, 1));
        ll.print();
        ll.reverse();
        ll.print();

    }
}
