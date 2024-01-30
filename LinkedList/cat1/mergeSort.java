package cat1;

public class mergeSort {
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

  public static Node mid(Node head) {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  public static Node merge(Node left, Node right) {
    if (left == null)
      return right;
    if (right == null)
      return left;

    // Initialize a dummy node to simplify edge cases
    Node dummy = new Node(0);
    Node current = dummy;

    while (left != null && right != null) {
      if (left.data < right.data) {
        current.next = left;
        left.prev = current;
        left = left.next;
      } else {
        current.next = right;
        right.prev = current;
        right = right.next;
      }
      current = current.next;
    }

    // Attach the remaining part of left or right list
    if (left != null) {
      current.next = left;
      left.prev = current;
    } else {
      current.next = right;
      right.prev = current;
    }

    // Return head of the merged list
    return dummy.next;
  }

  public static Node sortDoubly(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    // break ll
    Node middle = mid(head);
    Node left = head;
    Node right = middle.next;

    // Disconnect the left half from the right half
    middle.next = null;
    if (right != null) {
      right.prev = null;
    }

    // Sort both halves
    left = sortDoubly(left);
    right = sortDoubly(right);

    Node result = merge(left, right);
    return result;
  }

  public static void main(String[] args) {
    // Create nodes of the list
    Node head = new Node(4);
    Node node1 = new Node(3);
    Node node2 = new Node(5);
    Node node3 = new Node(1);
    Node node4 = new Node(2);

    // Setup next pointers
    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;

    // Setup prev pointers
    node1.prev = head;
    node2.prev = node1;
    node3.prev = node2;
    node4.prev = node3;

    // Sort the list
    Node sortedHead = sortDoubly(head);

    // Print the sorted list
    System.out.print("Sorted Doubly Linked List: ");
    while (sortedHead != null) {
      System.out.print(sortedHead.data + " ");
      sortedHead = sortedHead.next;
    }
  }

}
