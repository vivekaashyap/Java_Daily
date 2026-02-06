
public class LL {

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }
    private Node head;
    private int size;

    public void insertAtFirst(String data) {
        Node newNode = new Node(data);
        size++;
        newNode.next = head;
        head = newNode;
    }

    public void insertAtLast(String data) {
        Node newNode = new Node(data);
        size++;
        //not a single node ----> head = null
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtPosition(String data, int pos) {
        // do by your self
    }

    //T.C. O(1);
    public int length() {
        return size;
    }

    //T.C. O(n);
    public int length1() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LL obj = new LL();
        obj.insertAtFirst("Wei");
        obj.insertAtLast("Wuxian");
        obj.insertAtFirst("WanG");
        obj.display();
        System.out.println(obj.length());
    }
}
