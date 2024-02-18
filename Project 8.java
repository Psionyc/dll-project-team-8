class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList {
    Node head;

    public void insertAtFront(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAtIndex(int newData, int index) {
        Node newNode = new Node(newData);
        if (index == 0) {
            insertAtFront(newData);
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    public void insertAtBack(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void deleteNode(int key) {
        Node temp = head;
        if (temp != null && temp.data == key) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Key not found");
            return;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    public int search(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1; // Key not found
    }

    public void displayListFromStart() {
        Node node = head;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public void displayListFromEnd() {
        System.out.println("\nTraversal in reverse direction");
        Node temp = head;
        Node last = null;
        while (temp != null) {
            last = temp;
            temp = temp.next;
        }
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert 3 at the front of the list
        dll.insertAtFront(3);
        System.out.println("After inserting 3 at the front:");
        dll.displayListFromStart(); // Expected to display: 3

        // Insert 5 at the back of the list
        dll.insertAtBack(5);
        System.out.println("\nAfter inserting 5 at the back:");
        dll.displayListFromStart(); // Expected to display: 3 5

        // Insert 4 at index 1 (between 3 and 5)
        dll.insertAtIndex(4, 1);
        System.out.println("\nAfter inserting 4 at index 1:");
        dll.displayListFromStart(); // Expected to display: 3 4 5

        // Delete the node with data 4
        dll.deleteNode(4);
        System.out.println("\nAfter deleting the node with data 4:");
        dll.displayListFromStart(); // Expected to display: 3 5

        // Search for the node with data 5 and display its index
        int index = dll.search(5);
        System.out.println("\nAfter searching for the node with data 5:");
        System.out.println("Found at index: " + index); // Expected: Found at index: 1
    }

}
