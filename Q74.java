class Node {
    int data;
    Node next;
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class Q74 {
    static boolean searchKey(Node head, int key) {

        if (head == null)
            return false;
        if (head.data == key)
            return true;
        return searchKey(head.next, key);
    }

    public static void main(String[] args) {
        Node head = new Node(14);
        head.next = new Node(21);
        head.next.next = new Node(13);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);
        int key = 14;
        if (searchKey(head, key))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
