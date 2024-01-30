public class q4 {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static void main(String args[]) {
    Node head = new Node(10);
    Node temp1 = new Node(20);

    head.next = temp1;

    Node newHead = insert(head, 30);

    newHead = insertEnd(newHead, 40);
    newHead = insertEnd(newHead, 50);
    newHead = insertEnd(newHead, 60);
    printll(newHead);
  }

  public static void printll(Node head) {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
  }

  static Node insertEnd(Node head, int x) {
    Node temp = new Node(x);
    if (head == null)
      return temp;
    Node curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = temp;
    return head;
  }

  static Node insert(Node head, int data) {
    Node newNode = new Node(data);
    newNode.next = head;

    return newNode;
  }

}
