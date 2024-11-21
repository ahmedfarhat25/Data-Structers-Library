package StackLinkedListBased;
import LinkedList.LinkedList;
public class StackLinkedListOOP {
    private LinkedList stack;

    public StackLinkedListOOP() {
        stack = new LinkedList();
    }

    public void push(int value) {
        stack.addFirst(value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack.deleteFirst();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        stack.print();
    }
}
