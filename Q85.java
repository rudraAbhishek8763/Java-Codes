class Node{
  int data;
  Node next;
  Node(int val){
    data = val;
    next = null;
  }
}
class Q85{
  Node head;
  void deleteNodeWithoutHead(Node pos){
    if(pos == null)
      return;
    else{
      if(pos.next == null){
        System.out.println("This is last node, require head, can't be freed\n");
        return;
      }
    }
    pos.data = pos.next.data;
    pos.next = pos.next.next;
  }
  public void push(int new_data){
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }
  public void printList(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("NULL\n");
  }
  public static void main(String args[]){
    LinkedList llist = new LinkedList();
    llist.push(20);
    llist.push(4);
    llist.push(15);
    llist.push(35);
    System.out.println("Initial Linked List : ");
    llist.printList();
    Node del = llist.head.next;
    llist.deleteNodeWithoutHead(del);
    System.out.println("Final Linked List after deletion of 15 : ");
    llist.printList();
  }
}