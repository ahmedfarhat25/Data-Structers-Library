package LinkedList;

public class LinkedList {
    public Node head;
    public Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addFirst(int val) {
        LinkedListOperations.addFirst(this, val);
    }

    public void addLast(int val) {
        LinkedListOperations.addLast(this, val);
    }

    public void add(int pos, int val) {
        LinkedListOperations.add(this, pos, val);
    }

    public int deleteFirst() {
        return LinkedListOperations.deleteFirst(this);
    }

    public int deleteLast() {
        return LinkedListOperations.deleteLast(this);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int delete(int pos) {
        return LinkedListOperations.delete(this, pos);
    }

    public boolean search(int val) {
        return LinkedListOperations.search(this, val);
    }

    public void print() {
        LinkedListOperations.print(this);
    }

    public int getFirst() {
        return head.val;
    }
}
