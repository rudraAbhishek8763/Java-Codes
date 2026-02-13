class Node {
    int data;
    Node next;
    Node(int data)  {
        this.data = data;
        this.next = null;
    }
}
class Q83{
    static Node skipMdeleteN(Node head, int m, int n) {
        Node curr = head;
        Node t;
        int count;
        while (curr != null) {
            for (count = 1; count < m && curr != null;
                 count++)
                curr = curr.next;
            if (curr == null)
                return head;
            t = curr.next;
            for (count = 1; count <= n && t != null;
                 count++) {
                Node temp = t;
                t = t.next;
                temp = null;
            }
            curr.next = t;
            curr = t;
        }
        return head;
    }
    static void printList(Node head)
    {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        int m = 2, n = 2;
        head = skipMdeleteN(head, m, n);
        printList(head);
    }
}
