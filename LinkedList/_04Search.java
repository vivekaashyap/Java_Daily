public class _04Search{
    public class Node{
        int data;
        Node next;
        public Node(int data){
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
            head = tail = newNode;
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
            head = tail = newNode;
            size = 1;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addAtMiddle(int inx, int data) {
        Node newNode = new Node(data);
        if (inx == 0) {
            addAtFirst(data);
            size = 1;
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < inx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;//1,2,4,5 [3]
    }
    
    public int search(int key){
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp =temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[]args){
        _04Search ll = new _04Search();
        ll.addAtFirst(40);
        ll.addAtFirst(41);
        ll.addAtFirst(42);
        ll.addAtLast(45);
        System.out.println(ll.search(47));
        ll.print();
    }
}