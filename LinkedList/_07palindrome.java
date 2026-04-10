// public class _07palindrome {
    
//     public class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public void addAtLast(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public Node reverse(Node slow) {
//         Node curr = slow;
//         Node prev = null;
//         Node next;
//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }
    
//     public Node middle() {
//         Node slow = head;
//         Node fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
    
//     public boolean palindrome() {
//         Node mid = middle();
//         Node head2 = reverse(mid);
//         Node temp2 = head2;
//         Node head1 = head;
//         while (temp2 != null) {
//             if (head1.data != temp2.data) {
//                 return false;
//             }
//             head1 = head1.next;
//             temp2 = temp2.next;
//         }
//         reverse(head2);
//         return true;
//     }
    
//     public static void main(String[] args) {
//         _07palindrome ll = new _07palindrome();
//         ll.addAtLast(1);
//         ll.addAtLast(2);
//         ll.addAtLast(3);
//         ll.addAtLast(39);
//         ll.addAtLast(2);
//         ll.addAtLast(1);
//         System.out.println(ll.palindrome());
        
//     }
// }

public class _07palindrome {
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

    public void addAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public Node mid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
     
    public Node reverse(Node pos) {
        Node curr = pos;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean palindrome() {
        Node mid = mid();
        Node secondHead = reverse(mid);
        Node tempHead = head;
        while (secondHead != null) {
            if (secondHead.data != tempHead.data) {
                return false;
            }
            tempHead = tempHead.next;
            secondHead = secondHead.next;
        }
        return true;
    }

    public static void main(String[] args) {
        _07palindrome ll = new _07palindrome();
        ll.addAtLast(1); 
        ll.addAtLast(25); 
        ll.addAtLast(3); 
        ll.addAtLast(2); 
        ll.addAtLast(1);
        ll.print();
        ll.print();
        System.out.print(ll.palindrome());
    }
}