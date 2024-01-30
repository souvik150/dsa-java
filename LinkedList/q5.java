public class q5 {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(30);

    head.next = temp1;
    temp1.next = temp2;

    Node newHead = insertAtPos(head, 0, 40);

    printll(newHead);
  }

  public static void printll(Node head) {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
  }

  static Node insertAtPos(Node head, int position, int data) {
    Node node = new Node(data);
    node.next = null;
    if (head == null) {
      return head = node;
    } else if (position == 0) {
      node.next = head;
      head = node;
      return head;
    } else {
      Node cur = head;
      for (int i = 0; i < position - 1; i++) {
        cur = cur.next;
      }
      node.next = cur.next;
      cur.next = node;
      return head;
    }
  }
}
