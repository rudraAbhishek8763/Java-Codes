import java.util.HashSet;
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
class Q88 {
    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    static void removeLoop(Node head) {
        HashSet<Node> st = new HashSet<>();
        Node prev = null;
        while (head != null) {
            if (!st.contains(head)) {
                st.add(head);
                prev = head;
                head = head.next;
            }
            else {
                prev.next = null;
                break;
            }
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = head.next;
        removeLoop(head);
        printList(head);
    }
}
