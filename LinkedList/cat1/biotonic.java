package cat1;

public class biotonic {

  static class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
      this.data = data;
      this.prev = null;
      this.next = null;
    }
  }

  public static Node sortDLL(Node head) {
    // If the list is empty or there's only one node, return
    if (head == null || head.next == null) {
      return head;
    }

    // Pointer to first node of doubly linked list
    Node front = head;

    // Pointer to last node of doubly linked list.
    Node last = head;

    // Dummy node to which resultant sorted list is added.
    Node result = new Node(0);

    // Node after which next element of sorted list is added.
    Node resEnd = result;

    // Node to store next element to which pointer is moved after element pointed by
    // that pointer is added to result list.
    Node temp;

    // Find last element of input list.
    while (last.next != null) {
      last = last.next;
    }

    // Compare first and last element until both pointers are not equal
    while (front != last) {

      // If last element data is less than or equal to front element data, then add
      // last element to result list and change the last pointer to its previous
      // element
      if (last.data <= front.data) {
        resEnd.next = last;
        temp = last.prev;
        last.prev.next = null;
        last.prev = resEnd;
        last = temp;
        resEnd = resEnd.next;
      }

      // If front element is smaller, then add it to result list and change front
      // pointer to its next element
      else {
        resEnd.next = front;
        temp = front.next;
        front.next = null;
        front.prev = resEnd;
        front = temp;
        resEnd = resEnd.next;
      }
    }

    // Add the single element left to the result list
    resEnd.next = front;
    front.prev = resEnd;

    // The head of required sorted list is next to dummy node result
    return result.next;

  }

  static Node push(Node head, int data) {

    Node new_node = new Node(data);
    new_node.prev = null;
    new_node.next = (head);

    if ((head) != null)
      (head).prev = new_node;

    (head) = new_node;
    return head;
  }

  static void printList(Node head) {
    // if list is empty
    if (head == null)
      System.out.println("Doubly Linked list empty");

    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  public static void main(String args[]) {
    Node head = null;

    head = push(head, 1);
    head = push(head, 4);
    head = push(head, 6);
    head = push(head, 10);
    head = push(head, 12);
    head = push(head, 7);
    head = push(head, 5);
    head = push(head, 2);

    System.out.println("Original Doubly linked list:");
    printList(head);

    // sort the biotonic DLL
    head = sortDLL(head);

    System.out.println(
        "\nDoubly linked list after sorting:");
    printList(head);
  }
}
