
public class _02method {

    // class Node
    // add at first
    // add at last
    // print
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
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addatlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addinmiddle(int index, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (index != 0) {
            temp = temp.next;
            index--;
        }

    }

    public static void main(String[] args) {
        _02method ll = new _02method();
        ll.addAtFirst(1);
        ll.addAtFirst(10);
        ll.addAtFirst(100);
        ll.addinmiddle(1, 20);
        ll.print();
    }

}
