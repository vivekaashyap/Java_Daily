
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

    public String deleteAtFirst() {
        if (head == null) {
            return "No data to be deleted"; //Exception throw
        }
        String deleteValue = head.data;
        head = head.next;
        size--;
        return deleteValue;
    }

    public String deleteLast() {
        if (head == null) {
            return "No data to be deleted"; // Exception throw
        }
        size--;
        if (head.next == null) {
            //only single node 
            String deletedValue = head.data;
            head = null;
            return deletedValue;
        }
        //atleast 2 nodes
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        String deletedValue = temp.next.data;
        temp.next = null;
        return deletedValue;
    }

    // public String deletedAtAnyPosition(int pos) {
    // }
    //Searching and updation
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LL obj = new LL();
        System.out.println(obj.deleteAtFirst());
        obj.insertAtFirst("Wei");
        obj.insertAtLast("Wuxian");
        obj.insertAtFirst("WanG");
        obj.display();
        System.out.println(obj.deleteAtFirst());
        System.out.println(obj.length());
    }
}
