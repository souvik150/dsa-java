public class q8 {
  static class Node {
    int data;
    Node next;

    Node(int d) {
      this.data = d;
      this.next = null;
    }
  }

  public static void printll(Node head) {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
  }

  public static Node deleteHeadCircularLL(Node head) {
    if (head == null)
      return null;
    if (head.next == head)
      return null;
    head.data = head.next.data;
    head.next = head.next.next;
    return head;
  }

  public static Node deleteKthNode(Node head, int k) {
    if (head == null)
      return head;
    if (k == 1)
      return deleteHeadCircularLL(head);
    Node curr = head;

    for (int i = 0; i < k - 2; i++) {
      curr = curr.next;
    }

    curr.next = curr.next.next;

    return head;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(30);

    head.next = temp1;
    temp1.next = temp2;

    printll(head);

    System.out.println("");

    Node newHead = deleteKthNode(head, 3);
    printll(newHead);
  }
}
