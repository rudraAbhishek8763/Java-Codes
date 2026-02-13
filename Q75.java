class Node {
    int data;
    Node next;
    Node(int newData) {
        this.data = newData;
        this.next = null;
    }
}

class Q75{
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if(head.next!=null)
            System.out.print("->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printList(head);
    }
}
