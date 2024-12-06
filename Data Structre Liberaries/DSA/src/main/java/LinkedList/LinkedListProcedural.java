package LinkedList;
import java.util.NoSuchElementException;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListProcedural {
    private Node head;
    private Node tail;

    public LinkedListProcedural() {
        head = null;
        tail = null;
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void add(int pos, int val) {
        if (pos == 0) {
            addFirst(val);
            return;
        }

        Node newNode = new Node(val);
        Node current = head;
        for (int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        newNode.next = current.next;
        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public int deleteFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }

        int val = head.val;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return val;
    }

    public int deleteLast() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }

        if (head.next == null) {
            int val = head.val;
            head = null;
            tail = null;
            return val;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        int val = current.next.val;
        current.next = null;
        tail = current;

        return val;
    }

    public int delete(int pos) {
        if (pos == 0) {
            return deleteFirst();
        }

        Node current = head;
        for (int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        int val = current.next.val;
        current.next = current.next.next;

        if (current.next == null) {
            tail = current;
        }

        return val;
    }

    public boolean search(int val) {
        Node current = head;
        while (current != null) {
            if (current.val == val) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
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

    public void sort() {
        head = mergeSort(head);
    }

    private Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    private Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node sortedMerge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        Node result;
        if (left.val <= right.val) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }

    public int getFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        return head.val;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
