public class _03addMiddle{
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

    public void addMiddle(int inx, int data){
        if(inx == 0){
            addAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < inx-1){
            temp = temp.next;
            i++;
        }
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // public void size(){
    //     Node temp = head;
    //     int size = 0;
    //     while(temp != null){
    //         size++;
    //         temp = temp.next;
    //     }
    //     System.out.println("\n"+size);
    // }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void addAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int removeAtFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public void reverse() {
        Node prev = null;
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
    public int removeAtLast(){
        if(size == 0) {
            head = tail = null;
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static void main(String[]args){
        _03addMiddle ll = new _03addMiddle();
        ll.addAtFirst(1);
        ll.addAtFirst(2);
        ll.addAtFirst(3);
        ll.addAtFirst(4);
        ll.addAtFirst(5);
        ll.addMiddle(0, 48);
        ll.removeAtFirst();
        ll.removeAtLast();
        ll.print();
        // ll.size();
        System.out.println("\n"+ll.size);
        ll.reverse();
        ll.print();
    }

}