class Q82 {
    static Node head;
    static class Node {
        int data;
        Node next, prev;
        Node(int d) {
            data = d;
            next = prev = null;
        }
    }
    static Node reverse(Node curr) {
        if (curr == null)
            return null;
        Node temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;
        if (curr.prev == null) {
            return curr;
        }
        return reverse(curr.prev);
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if(node.next != null){
                System.out.print(" <-> ");
            }
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head = reverse(head);
        printList(head);
    }
}
