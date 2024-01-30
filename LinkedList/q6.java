public class q6 {
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

    Node newHead = deleteFirstNode(head);
    printll(newHead);

    System.out.println();

    Node afterLast = deleteLastNode(head);
    printll(afterLast);
  }

  public static void printll(Node head) {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
  }

  public static Node deleteFirstNode(Node head) {
    if (head == null)
      return null;
    else {
      return head.next;
    }
  }

  public static Node deleteLastNode(Node head) {
    if (head == null)
      return null;
    if (head.next == null)
      return null;

    Node curr = head;
    while (curr.next.next != null) {
      curr = curr.next;
    }

    curr.next = null;
    return head;
  }
}
