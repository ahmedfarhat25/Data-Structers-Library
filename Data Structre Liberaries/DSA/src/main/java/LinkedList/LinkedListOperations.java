package LinkedList;

public class LinkedListOperations {
    public Node head;

    public static void addFirst(LinkedList list, int val) {
        if (list.isEmpty()) {
            list.head = new Node(val);
            list.tail = list.head;
            return;
        }
        Node newNode = new Node(val);
        newNode.next = list.head;
        list.head = newNode;
    }

    public static void addLast(LinkedList list, int val) {
        if (list.isEmpty()) {
            list.head = new Node(val);
            list.tail = list.head;
            return;
        }
        Node newNode = new Node(val);
        list.tail.next = newNode;
        list.tail = newNode;
    }

    public static void add(LinkedList list, int pos, int val) {
        if (pos == 1) {
            addFirst(list, val);
            return;
        }
        Node current = list.head;
        int count = 1;
        while (count < pos - 1) {
            count++;
            current = current.next;
        }
        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
    }

    public static int deleteFirst(LinkedList list) {
        if (list.isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        Node current = list.head;
        list.head = list.head.next;
        current.next = null;
        if (list.isEmpty()) {
            list.tail = null;
        }
        return current.val;
    }

    public static int deleteLast(LinkedList list) {
        if (list.isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        if (list.head == list.tail) {
            int val = list.head.val;
            list.head = null;
            list.tail = null;
            return val;
        }
        Node current = list.head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        list.tail = prev;
        return current.val;
    }

    public static int delete(LinkedList list, int pos) {
        if (list.isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        if (pos == 1) {
            return deleteFirst(list);
        }
        Node current = list.head;
        Node prev = null;
        int count = 1;
        while (count < pos - 1) {
            count++;
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        current.next = null;
        return current.val;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        return head.val; // Return the value of the head node
    }

    public static boolean search(LinkedList list, int val) {
        Node current = list.head;
        while (current != null) {
            if (current.val == val) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public int size() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    // Function to reverse the linked list
    public void reverse() {
        if (isEmpty() || head.next == null) {
            return; // No need to reverse if the list is empty or has one element
        }

        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current;      // Move `prev` to the current node
            current = next;      // Move `current` to the next node
        }

        // After the loop, `prev` will be the new head
        next = head; // Update the tail
        head = prev; // Update the head
    }
    public static void print(LinkedList list) {
        Node current = list.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
