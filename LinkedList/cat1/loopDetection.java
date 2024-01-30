package cat1;

import java.util.HashSet;

public class loopDetection {
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
    // temp2.next = head;

    boolean loop = isLoopDetected(head);
    System.out.println("Loop present:- " + loop);
  }

  public static boolean isLoopDetected(Node h) {
    HashSet<Node> s = new HashSet<Node>();
    while (h != null) {
      // If we have already has this node
      // in hashmap it means there is a cycle
      // (Because you we encountering the
      // node second time).
      if (s.contains(h))
        return true;

      // If we are seeing the node for
      // the first time, insert it in hash
      s.add(h);

      h = h.next;
    }

    return false;
  }
}
