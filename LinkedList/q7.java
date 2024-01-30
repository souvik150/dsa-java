public class q7 {
  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  public static void printlist(Node head) {
    if (head == null)
      return;
    Node r = head;
    do {
      System.out.print(r.data + " ");
      r = r.next;
    } while (r != head);
  }

  public static Node insertAtBegin(Node head, int data) {
    Node newNode = new Node(data);

    if (head == null) {
      newNode.next = newNode;
      return newNode;
    }

    // Find the last node
    Node curr = head;
    while (curr.next != head) {
      curr = curr.next;
    }

    // Insert the new node between the last node and the head
    curr.next = newNode;
    newNode.next = head;

    // Return the new node, as it's now the head of the list
    return newNode;
  }

  public static Node insertAtLast(Node head, int data) {
    Node lastNode = new Node(data);
    if (head == null) {
      lastNode.next = lastNode;
      return lastNode;
    }

    // Find the last node
    Node curr = head;
    while (curr.next != head) {
      curr = curr.next;
    }

    curr.next = lastNode;
    lastNode.next = head;

    return head;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(5);
    head.next.next = new Node(20);
    head.next.next.next = new Node(15);
    head.next.next.next.next = head;
    printlist(head);

    System.out.println("");

    Node newHead = insertAtBegin(head, 69);
    printlist(newHead);

    System.out.println("");

    Node lastHead = insertAtLast(newHead, 40);
    printlist(lastHead);
  }
}
