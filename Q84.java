class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
class Q84 {
    static Node deleteLastOccurrence(Node head, int key) {
        Node last = null, lastPrev = null;
        Node curr = head, prev = null;
        while (curr != null) {
            if (curr.data == key) {
                lastPrev = prev;
                last = curr;
            }
            prev = curr;
            curr = curr.next;
        }
        if (last != null) {
            if (lastPrev != null) {
                lastPrev.next = last.next;
            } else {
                head = head.next;
            }
        }
        return head;
    }
    static void print(Node curr) {
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);
        int key = 2;
        head = deleteLastOccurrence(head, key);
        print(head);
    }
}
