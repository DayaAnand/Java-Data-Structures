class Node { // node creation
  public int value;
  public Node next;
}

class SinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createSinglyLinkedList(int nodeValue) {
    head = new Node();
    Node node = new Node();
    node.next = null;
    node.value = nodeValue;
    head = node;
    tail = node;
    size = 1; // to find the size of the Linked List
    return head;
  }

  // Insert Method SinglyLinkedList
  public void insertInLinkedList(int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;
    if (head == null) {
      createSinglyLinkedList(nodeValue);
      return;
    } else if (location == 0) { // Insert at the Beginning
      node.next = head;
      head = node;
    } else if (location >= size) { // Insert at the Last
      node.next = null;
      tail.next = node;
      tail = node;
    } else { // Insert at specific location
      Node tempNode = head;
      int index = 0;
      while (index < location - 1) {
        tempNode = tempNode.next;
        index++;
      }
      Node nextNode = tempNode.next;
      tempNode.next = node;
      node.next = nextNode;
    }
    size++;
  }

  // SinglyLinkedList Traversal
  public void traverseSinglyLinkedList() {
    if (head == null) {
      System.out.println("SLL does not exist!");
    } else {
      Node tempNode = head;
      for (int i = 0; i < size; i++) {
        System.out.print(tempNode.value);
        if (i != size - 1) {
          System.out.print(" -> ");
        }
        tempNode = tempNode.next;
      }
    }
    System.out.println("\n");
  }

  // Search for a node

  boolean searchNode(int nodeValue) {
    if (head != null) {
      Node tempNode = head;
      for (int i = 0; i < size; i++) {
        if (tempNode.value == nodeValue) {
          System.out.print("Found the node at location: " + i + "\n");
          return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.print("Node not found! ");
    return false;
  }

  // Deleting a node from SinglyLinkedList
  public void deletionOfNode(int location) {
    if (head == null) {
      System.out.println("The SLL does not exist");
      return;
    } else if (location == 0) { // Delete at the Beginning
      head = head.next;
      size--;
      if (size == 0) {
        tail = null;
      }
    } else if (location >= size) { // Delete at the Last
      Node tempNode = head;
      for (int i = 0; i < size - 1; i++) {
        tempNode = tempNode.next;
      }
      if (tempNode == head) {
        tail = head = null;
        size--;
        return;
      }
      tempNode.next = null;
      tail = tempNode;
      size--;
    } else { // Delete at specific position
      Node tempNode = head;
      for (int i = 0; i < location - 1; i++) {
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      size--;
    }
  }

  // Delete Entire SinglyLinkedList
  public void deleteSLL() {
    head = null;
    tail = null;
    System.out.println("The SLL deleted successfully");

  }

}

class MainSinglyLinkedList {
  public static void main(String[] args) {
    SinglyLinkedList sLL = new SinglyLinkedList();
    sLL.createSinglyLinkedList(5);
    System.out.println("Created an empty Linked List Successfully...");
    // System.out.println(sLL.head.value);
    System.out.println("Inserting: ");
    sLL.insertInLinkedList(6, 1);
    sLL.insertInLinkedList(7, 3);
    sLL.insertInLinkedList(8, 4);
    sLL.insertInLinkedList(9, 0);
    System.out.println("Traverse: ");
    sLL.traverseSinglyLinkedList();
    System.out.println("Search: ");
    sLL.searchNode(8);
    System.out.println("Delete: ");
    sLL.deleteSLL();
    sLL.traverseSinglyLinkedList();

  }
}
